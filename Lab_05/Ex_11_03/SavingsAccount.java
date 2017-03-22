package Ex_11_03;

public class SavingsAccount extends Account {

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }

    public void withdraw(double amount) {

        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Savings Account overdrawn");
        }
    }
}