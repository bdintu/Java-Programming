/*
Programming Exercise 9.7 p.361 (The Account class)
 */
package Lab_04;

public class Ex_09_07 {

    public static void main(String[] args) {

        Account account = new Account(1122, 20000.0, 4.5);
        account.withdraw(2500.0);
        account.deposit(3000.0);
        System.out.println(account.toString());
    }
}