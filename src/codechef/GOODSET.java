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
public class GOODSET {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int T, i, j, var, n;
        T = input.nextInt();
        if (T > 100) {
            T = 100;
        }
        if (T < 1) {
            T = 1;
        }
        for (i = 0; i < T; i++) {
            n = input.nextInt();
            if (n > 100) {
                n = 100;
            }
            if (n < 1) {
                n = 1;
            }
            for (j = 0, var = 1; j < n; j++, var = var + 2) {
                System.out.print(var + " ");
            }
            System.out.println();
        }
    }
}
