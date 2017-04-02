package ex_11_03;

import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        this(0, 0.0, 0.0);
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new Date();
    }

    public void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
        }
    }

    public void deposit(double amount) {

        if (amount >= 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
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

    public String toString() {
        return "The balance is $" + balance + "\nthe monthly interest is " + getMonthlyInterest() + "%\nthe date when this account was created is " + dateCreated + "\n";
    }
}
