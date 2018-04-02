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
public class FRK {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String name;
        int count = 0;
        for (int i = 0; i < N; i++) {
            name = in.next();

            if (name.contains("chef")) {
                count++;
            } else if (name.contains("ch")) {
                count++;
            } else if (name.contains("ef")) {
                count++;
            } else if (name.contains("he")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
