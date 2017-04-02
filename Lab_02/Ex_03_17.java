/*
Programming Exercise 3.17 p.133
 */
package lab_02;

import java.util.Scanner;

public class Ex_03_17 {

    public static void main(String args[]) {

        String a[] = {"scissor", "rock", "paper"};
        int random = (int) (Math.random() * 3);

        System.out.print("scissor (0), rock (1), paper (2):");

        Scanner sn = new Scanner(System.in);
        int me = sn.nextInt();

        System.out.print("The computer is " + a[random]);
        System.out.print(" You are " + a[me] + ".");

        if (me == random) {
            System.out.print("tooIt is a draw");
        } else if (me == 0 && random == 1) {
            System.out.print("You lose");
        } else if (me == 0 && random == 2) {
            System.out.print("You win");
        } else if (me == 1 && random == 0) {
            System.out.print("You win");
        } else if (me == 1 && random == 2) {
            System.out.print("You lose");
        } else if (me == 2 && random == 0) {
            System.out.print("You lose");
        } else if (me == 2 && random == 1) {
            System.out.print("You win");
        }
    }
}
