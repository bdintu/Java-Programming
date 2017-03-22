/*
Programming Exercise 10.7 p.401 (Game: ATM machine)
 */
package Lab_04;

import java.util.Scanner;

public class Ex_10_07 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        final int size = 10;

        Account[] account = new Account[size];
        for (int i = 0; i < size; i++) {
            account[i] = new Account();
        }

        while (true) {

            System.out.println("Enter an id:");

            int i = sn.nextInt();
            int j = 0;

            while (j != 4) {

                printMenu();
                j = sn.nextInt();

                switch (j) {
                    case 1:
                        System.out.println("The balance is " + account[i].getBalance());
                        break;
                    case 2:
                        System.out.println("Enter an amount to withdraw:");
                        account[i].withdraw(sn.nextInt());
                        break;
                    case 3:
                        System.out.println("Enter an amount to deposit:");
                        account[i].deposit(sn.nextInt());
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public static void printMenu() {
        System.out.println("Main menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
        System.out.println("Enter a choice:");
    }
}
