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
public class SIMDISH {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int count, j, k, arr[] = new int[T];
        if (T >= 200) {
            T = 200;
        }
        String s[] = new String[8];

        for (int i = 0; i < T; i++) {
            count = 0;

            s[0] = input.next();
            s[1] = input.next();
            s[2] = input.next();
            s[3] = input.next();
            s[4] = input.next();
            s[5] = input.next();
            s[6] = input.next();
            s[7] = input.next();

            for (j = 0; j < 4; j++) {
                s[j].toLowerCase();
                for (k = 4; k < 8; k++) {
                    s[k].toLowerCase();
                    if (s[j].equals(s[k])) {
                        count++;
                    }
                }
            }

            if (count >= 2) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }

        for (int i = 0; i < T; i++) {
            switch (arr[i]) {
                case 0:
                    System.out.println("dissimilar");
                    break;
                default:
                    System.out.println("similar");
                    break;
            }
        }

    }
}
