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
public class UNIONSET {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int T, temp, result = 0;
        T = input.nextInt();
        while (T > 0) {
            int N = input.nextInt();
            int arr[][] = new int[N][];
            int K = input.nextInt();
            for (int i = 0; i < N; i++) {
                temp = input.nextInt();
                arr[i] = new int[temp];
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = input.nextInt();
                }
            }
            int flag[] = new int[K];
            for (int i = 0; i < K; i++) {
                flag[i] = i + 1;
            }
            for (int i = 0; i < N; i++) {
                for (int j = 1 + i; j < N; j++) {
                    int count = 0;
                    for (int k = 0; k < arr[i].length; k++) {
                        flag[arr[i][k] - 1] = 1;
                    }
                    for (int k = 0; k < arr[j].length; k++) {
                        flag[arr[j][k] - 1] = 1;
                    }
                    for (int k = 0; k < flag.length; k++) {
                        if (flag[k] == 1) {
                            flag[k] = 0;
                            count++;
                        } else {
                            flag[k] = 0;
                        }
                    }
                    if (count == K) {
                        result++;
                    }
                }

            }
            System.out.println(result);
            result = 0;
            T--;
        }
    }
}
