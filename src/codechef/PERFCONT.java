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
public class PERFCONT {

    public static void main(String args[]) {
        int t, n, p;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int half = 0, tenth = 0, cake = 0, hard = 0, temp;
            n = in.nextInt();
            p = in.nextInt();
            half = p / 2;
            tenth = p / 10;
            for (int j = 0; j < n; j++) {
                temp = in.nextInt();
                if (temp <= tenth) {
                    hard++;
                }
                if (temp >= half) {
                    cake++;
                }
            }
            if (cake == 1 && hard == 2) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
