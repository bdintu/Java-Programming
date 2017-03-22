/*
Programming Exercise 11.8 p.446 (New Account class)
 */
package Ex_11_08;

public class Ex_11_08 {

    public static void main(String[] args) {

        Account account = new Account(1122, 1000.0, 1.5, "George");
        account.deposit(30.0);
        account.deposit(40.0);
        account.deposit(50.0);
        account.withdraw(5.0);
        account.withdraw(4.0);
        account.withdraw(2.0);

        System.out.println(account.toString());
        for (int i = 0; i < account.getTransactions().size(); i++) {
            System.out.print("id " + i + " : ");
            System.out.println(account.getTransactions().get(i).toString());
        }
    }
}