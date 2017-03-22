/*
Programming Exercise 5.17 p.215
 */
package Lab_02;

import java.util.Scanner;

public class Ex_05_17 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 7; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
