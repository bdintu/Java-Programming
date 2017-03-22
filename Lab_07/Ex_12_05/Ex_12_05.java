/*
Programming Exercise 12.5 p.488 (IllegalTriangleException)
 */
package Ex_12_05;

import java.util.Scanner;

public class Ex_12_05 {

    public static void main(String[] args) throws IllegalTriangleException {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Enter a color: ");
        String color = input.next();

        System.out.print("filled (true / false): ");
        boolean filled = input.nextBoolean();

        try {
            Triangle triangle = new Triangle(side1, side2, side3, color, filled);
            System.out.println(triangle);
        } catch (IllegalTriangleException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
