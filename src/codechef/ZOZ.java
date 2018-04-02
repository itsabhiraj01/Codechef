/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechef;

import java.util.Scanner;

/**
 *
 * @author ABHIRAJ
 */
public class ZOZ {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int N, K, sum = 0;
            N = in.nextInt();
            K = in.nextInt();
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = in.nextInt();
                sum += arr[j];
            }
            int count = 0;
            for (int j = 0; j < N; j++) {
                if ((sum - arr[j]) < (arr[j] + K)) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
