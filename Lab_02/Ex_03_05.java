/*
Programming Exercise 3.5 p.131 
 */
package Lab_02;

import java.util.Scanner;

public class Ex_03_05 {

    public static void main(String args[]) {
        String a[] = {"Sun", "Mon", "Tues", "Wednes", "Thurs", "Fri", "Satur"};
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter today's day:");
        int d = sn.nextInt();

        System.out.print("Enter the number of days elapsed since today:");
        int n = sn.nextInt();

        System.out.print("Today is " + a[d] + "day and the future day is " + a[(d + n) % 7] + "day");
    }
}
