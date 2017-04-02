package ex_11_03;

public class CheckingAccount extends Account {

    private double overdraft;

    public CheckingAccount() {
        super();
        overdraft = 0;
    }

    public CheckingAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public void withdraw(double amount) {
        if (getBalance() - amount >= overdraft) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Checking Amount overdraft limit");
        }
    }

    public String toString() {
        return super.toString() + "Overdraft limit $" + overdraft + "\n";
    }
}
