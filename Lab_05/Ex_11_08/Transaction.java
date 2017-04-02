package ex_11_08;

import java.util.Date;

public class Transaction {

    private char type;
    private double amount;
    private double balance;
    private String description;
    private Date dateCreated;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        dateCreated = new Date();
    }

    public void withdraw(double amount) {

        if (balance - amount >= 0) {
            balance -= amount;
        }
    }

    public void deposit(double amount) {

        if (amount >= 0) {
            balance += amount;
        }
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Date" + dateCreated + ", Type " + type + ", Amount " + amount + ", Balance " + balance + ", Description " + description + "\n";
    }
}
