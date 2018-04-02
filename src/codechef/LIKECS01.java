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
public class LIKECS01 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int start = 0, end = 0, t = in.nextInt();
        String str;
        for (int i = 1; i <= t; i++) {
            str = in.next();
            for (int j = 0; j < str.length(); j++) {
                for (int k = j + 1; k < str.length(); k++) {
                    if (str.charAt(j) == str.charAt(k)) {
                        start = 1;
                    }
                }
            }
            if (start == 1) {
                System.out.println("yes");
                start = 0;
            } else {
                System.out.println("no");
            }
        }
    }
}
