/*
Programming Exercise 11.3 p.445 (Subclasses of Account)
 */
package Ex_11_03;

public class Ex_11_03 {

    public static void main(String[] args) {

        Account account = new Account(1122, 20000.0, 4.5);
        SavingsAccount saving = new SavingsAccount(1123, 20000.0, 4.5);
        CheckingAccount checking = new CheckingAccount(1124, 20000.0, 4.5, -10);

        account.withdraw(2500.0);
        account.deposit(3000.0);

        saving.withdraw(2500.0);
        saving.deposit(3000.0);

        checking.withdraw(2500.0);
        checking.deposit(3000.0);

        System.out.println(account.toString());
        System.out.println(saving.toString());
        System.out.println(checking.toString());
    }
}
