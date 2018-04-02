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
public class XENRANK {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int T, x, y, i, j, k;
        T = input.nextInt();
        while (T > 0) {
            x = input.nextInt();
            int xa[] = new int[10];
            i = 0;
            while (x != 0) {
                xa[i] = x % 10;
                x /= 10;
                i++;
            }
            y = input.nextInt();
            int ya[] = new int[10];
            i = 0;
            while (y != 0) {
                ya[i] = y % 10;
                y /= 10;
                i++;
            }
            int var1[] = new int[10];
            int var2[] = new int[10];
            int suma = 0, sumb = 0, carrya = 1, carryb = 2;
            for (i = 0; i < 10; i++) {
                suma = xa[i] + ya[i] + carrya;
                sumb = xa[i] + ya[i] + carryb;
                var1[i] = suma % 10;
                carrya = suma / 10;
                var2[i] = sumb % 10;
                carryb = sumb / 10;
            }

            int ans[] = new int[20];
            suma = 0;
            k = 0;
            carrya = 0;
            for (i = 0; i < 10; i++) {
                k = i;
                for (j = 0; j < 10; j++) {
                    suma = var1[i] * var2[j];
                    suma += carrya;
                    ans[k] += suma;
                    if (ans[k] > 9) {
                        carryb = ans[k] % 10;
                        carrya = ans[k] / 10;
                        ans[k] = carryb;
                    } else {
                        carrya = 0;
                    }
                    k++;
                }
                while (carrya > 0) {
                    ans[k] += carrya;
                    if (ans[k] > 9) {
                        carrya = ans[k] % 10;
                        ans[k] /= 10;
                        k++;
                    } else {
                        carrya = 0;
                    }
                }

            }
            // ans/2
            for (i = ans.length - 1; i >= 0; i--) {
                if (ans[i] % 2 == 0) {
                    ans[i] /= 2;
                } else {
                    ans[i] /= 2;
                    ans[i - 1] = ans[i - 1] + 10;
                }
            }

            for (i = 0; i < ya.length; i++) {
                if (ans[i] >= ya[i]) {
                    ans[i] -= ya[i];
                } else {
                    ans[i] = ans[i] + 10;
                    ans[i + 1] -= 1;
                    ans[i] -= ya[i];
                    if (ans[i] > 9) {
                        carrya = ans[i] % 10;
                        ans[i + 1] = ans[i] / 10;
                        ans[i] = carrya;
                    }

                }
            }
            int p = 0;
            for (i = ans.length - 1; i >= 0; i--) {
                if (ans[i] != 0) {
                    System.out.print(ans[i]);
                    p = 1;
                } else {
                    if (p == 1) {
                        System.out.print(ans[i]);
                    }
                }
            }
            System.out.println();
            T--;
        }
    }
}
