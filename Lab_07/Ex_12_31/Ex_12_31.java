/*
Programming Exercise 12.31 p.492 (Baby name popularity ranking)
*/

package Ex_12_03;


import java.util.Scanner;
import java.io.FileInputStream;

public class Ex_12_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FileInputStream in;

        System.out.print("Enter the year: ");
        String year = input.nextLine();

        System.out.print("Enter the gender: ");
        String gender = input.nextLine();

        System.out.print("Enter the name: ");
        String name = input.nextLine();

        try {
            in = new FileInputStream("Babynamesranking" + year + ".txt");

            while () {


                if ( ) {
                    System.out.println(name + " is ranked #" + rank + " in year " + year);
                    retrun 0;
                } else {
                    System.out.println("The name " + name + " is not ranked in year " + year);
                }
            }
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}