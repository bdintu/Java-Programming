package Ex_11_08;

import java.util.ArrayList;
import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private String name;
    private ArrayList<Transaction> transactions;
    private Date dateCreated;

    public Account() {
        this(0, 0.0, 0.0, "");
    }

    public Account(int id, double balance, double annualInterestRate, String name) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.name = name;
        transactions = new ArrayList<Transaction>();
        dateCreated = new Date();
    }

    public void withdraw(double amount) {

        if (balance - amount >= 0) {
            balance -= amount;
            transactions.add(new Transaction('W', amount, balance, "Withdrawal"));
        }
    }

    public void deposit(double amount) {

        if (amount >= 0) {
            balance += amount;
            transactions.add(new Transaction('D', amount, balance, "Deposit"));
        }
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public double getBalance() {
        return balance;
    }

    public double getMonthlyInterestRate() {
        return balance * getMonthlyInterest();
    }

    public double getMonthlyInterest() {
        return annualInterestRate / 12;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Accountholder name is " + name + "\nthe monthly interest is " + getMonthlyInterest() + "%\nThe balance is $" + balance + "\nthe date when this account was created is " + dateCreated + "\n";
    }
}
