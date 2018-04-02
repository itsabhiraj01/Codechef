/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechef;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ABHIRAJ
 */
public class MEX {

    public static int search(int[] num, int ele) {
        int start = 0, end = num.length - 1, mid;
        while (true) {
            mid = (start + end) / 2;
            if (ele == num[mid]) {
                return 1;
            } else if (ele > num[mid]) {
                start = mid;
            } else {
                end = mid;
            }
            if (start == end) {
                return 0;
            }
            if (start == mid && (start + 1) == end) {
                start = end;
            }
        }
    }

    public static void main(String args[]) {
        int t, s, n;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        for (int i = 0; i < t; i++) {
            s = in.nextInt();
            n = in.nextInt();
            int temp = 0, nCount = -1;
            int[] num = new int[s];
            for (int j = 0; j < s; j++) {
                num[j] = in.nextInt();
            }
            Arrays.sort(num);
            while (nCount != n) {
                int flagInt = search(num, temp);
                if (flagInt == 1) {
                    temp++;
                } else {
                    temp++;
                    nCount++;
                }
            }
            System.out.println(--temp);
        }
    }
}
