/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ABHIRAJ
 */
public class ROWSOLD {

    public static void main(String args[]) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(input.readLine());
        int count = 0, pre = 1, time = 0, zero = 0;
        /*if(T>5)
         T=5;
         if(T<1)
         T=1;*/
        String arr[] = new String[T];

        for (int i = 0; i < T; i++) {
            arr[i] = input.readLine();
            if (arr[i].length() > 100000) {
                throw new RuntimeException("User name too long");
            }
        }
        for (int i = 0; i < T; i++) {
            char ch[] = arr[i].toCharArray();
            for (char c : ch) {
                if (c == '0') {
                    if (pre == 0) {
                        zero++;
                    }
                    pre = 0;
                } else {
                    if (pre == 0) {
                        time = time + ((2 + zero) * count);
                        pre = 1;
                    }
                    count++;
                    zero = 0;
                }
            }
            if (pre == 0) {
                time = time + ((2 + zero) * count);
            }
            System.out.println(time);
            count = 0;
            pre = 1;
            zero = 0;
            time = 0;
        }

    }
}
