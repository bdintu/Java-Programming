/*
Programming Exercise 4.24 p.178
 */
package Lab_02;

import java.util.Scanner;

public class Ex_04_24 {

    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        String a[] = new String[3];
        String w[] = {"first", "second", "third"};

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the " + w[i] + " city:");
            a[i] = sn.nextLine();
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < 3; j++) {
                if (a[i].charAt(0) > a[j].charAt(0)) {
                    String tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }

        System.out.print("The three cities in alphabetical order are");

        for (int i = 0; i < 3; i++) {
            System.out.print(" " + a[i]);
        }
    }
}
