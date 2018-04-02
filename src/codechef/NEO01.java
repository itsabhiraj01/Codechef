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
public class NEO01 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int T, i;
        T = input.nextInt();
        while (T > 0) {
            int N = input.nextInt();
            int A[] = new int[N];
            for (i = 0; i < N; i++) {
                A[i] = input.nextInt();
            }
            int count = 0;
            long sum = 0l;
            for (i = 0; i < N; i++) {
                if (A[i] <= 0) {
                    sum = sum + A[i];
                    A[i] = 0;
                } else {
                    count++;
                }
            }
            for (i = 0; i < N; i++) {
                sum = sum + A[i] * count;
            }

            System.out.println(sum);
            T--;
        }
    }
}
