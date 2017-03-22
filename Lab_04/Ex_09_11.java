/*
Programming Exercise 9.11 p.363 (Algebra: 2 * 2 linear equations) 
 */
package Lab_04;

import java.util.Scanner;

public class Ex_09_11 {

    public static void main(String[] args) {
        double a, b, c, d, e, f;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
        e = sc.nextDouble();
        f = sc.nextDouble();

        LinearEquation haha = new LinearEquation(a, b, c, d, e, f);
        if (haha.isSolvable() == true) {
            System.out.println("x is");
            System.out.println(haha.getX());
            System.out.println("y is");
            System.out.println(haha.getY());
        } else {
            System.out.println("The equation has no solution");
        }
    }
}