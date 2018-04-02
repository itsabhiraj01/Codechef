/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechef;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ABHIRAJ
 */
public class SUMQ {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int T, x, y;
        T = input.nextInt();
        String str1, str2;
        for (int i = 0; i < T; i++) {
            int p = input.nextInt();
            if (p < 1) {
                p = 1;
            }
            if (p > 100) {
                p = 100000;
            }
            int q = input.nextInt();
            if (q < 1) {
                q = 1;
            }
            if (q > 100) {
                q = 100000;
            }
            int r = input.nextInt();
            if (r < 1) {
                r = 1;
            }
            if (r > 100) {
                r = 100000;
            }
            int[] A = new int[p];
            int[] B = new int[q];
            int[] C = new int[r];
            BigInteger sum = new BigInteger("0");
            BigInteger temp1;
            BigInteger temp2;
            for (int j = 0; j < p; j++) {
                A[j] = input.nextInt();
            }
            for (int j = 0; j < q; j++) {
                B[j] = input.nextInt();
            }
            for (int j = 0; j < r; j++) {
                C[j] = input.nextInt();
            }

            for (int j = 0; j < p; j++) {
                for (int k = 0; k < q; k++) {
                    if (A[j] <= B[k]) {
                        for (int l = 0; l < r; l++) {
                            if (B[k] >= C[l]) {
                                temp1 = new BigInteger(Integer.toString(A[j] + B[k]));
                                temp2 = new BigInteger(Integer.toString(B[k] + C[l]));
                                temp1 = temp2.multiply(temp1);
                                sum = sum.add(temp1);

                            }
                        }
                    }
                }
            }
            temp2 = new BigInteger("1000000007");
            System.out.println(sum.remainder(temp2));
        }
    }
}
