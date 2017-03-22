/*
Programming Exercise 12.3 p.488 (ArrayIndexOutOfBoundsException)
 */
package Ex_12_03;

import java.util.Scanner;

public class Ex_12_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() + (double) 0.5);
        }

        System.out.print("Enter the specified index is out of bounds: ");

        try {
            System.out.println("value is " + array[input.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds.");
        }
    }
}
