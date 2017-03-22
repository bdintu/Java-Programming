/*
Programming Exercise 13.1 p.529 (Triangle class)
 */
package Ex_13_01;

import java.util.Scanner;

public class Ex_13_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Enter a color: ");
        String color = input.next();

        System.out.print("filled (true / false): ");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3, color, filled);
        System.out.println(triangle);
    }
}
