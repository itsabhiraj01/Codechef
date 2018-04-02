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
public class DISHLIFE {

    public static void main(String args[]) throws Exception {
        int i, j, k, p, result, temp, l, count, N, K;
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for (i = 0; i < T; i++) {
            result = 3;
            temp = 0;
            count = 0;
            p = 0;
            N = input.nextInt();
            K = input.nextInt();
            int a[][] = new int[N][K], b[] = new int[N];
            for (j = 0; j < N; j++) {
                p = input.nextInt();
                if (p >= K && N == 1) {
                    result = 2;
                }
                if (p >= K && N > 1) {
                    result = 1;
                }
                for (k = 0; k < p; k++) {
                    temp = input.nextInt();
                    if ((k + 1) == temp) {
                        a[j][k] = temp;
                    } else {
                        a[j][temp - 1] = temp;
                    }
                }
            }
            temp = 0;
            if (!(result == 1 || result == 2)) {
                for (j = 0; j < K; j++) {
                    p = 0;
                    temp = N;
                    for (k = 0; k < N; k++) {
                        if (a[k][j] == 0) {
                            temp--;
                        } else {
                            p = k;
                        }
                    }
                    if (temp == 0) {
                        result = 0;
                    }
                    if (temp == 1) {
                        b[p] = 1;
                    }
                }
                if (result != 0) {
                    temp = 0;
                    for (j = 0; j < N; j++) {
                        if (b[j] == 1) {
                            temp++;
                        }
                    }
                    if (temp == N) {
                        result = 2;
                    } else {
                        result = 1;
                    }
                }
            }
            switch (result) {
                case 0:
                    System.out.println("sad");
                    break;
                case 1:
                    System.out.println("some");
                    break;
                case 2:
                    System.out.println("all");
                    break;
                default:
                    System.out.println("some");
            }
        }
    }
}
