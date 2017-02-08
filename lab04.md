Programming Exercise 9.7 p.361 (The Account class)
Design a class named Account that contains:
 A private int data field named id for the account (default 0).
 A private double data field named balance for the account (default 0).
 A private double data field named annualInterestRate that stores the
currentinterest rate (default 0). Assume all accounts have the same
interest rate.
 A private Date data field named dateCreated that stores the date when the
account was created.
 A no-arg constructor that creates a default account.
 A constructor that creates an account with the specified id and initial
balance.
 The accessor and mutator methods for id, balance, and annualInterestRate.
 The accessor method for dateCreated.
 A method named getMonthlyInterestRate() that returns the monthly interest
rate.
 A method named getMonthlyInterest() that returns the monthly interest.
 A method named withdraw that withdraws a specified amount from the account.
 A method named deposit that deposits a specified amount to the account.
Draw the UML diagram for the class and then implement the class. (Hint: The
method getMonthlyInterest() is to return monthly interest, not the interest rate.
Monthly interest is balance * monthlyInterestRate. monthlyInterestRate is
annualInterestRate / 12.
Note that annualInterestRate is a percentage, e.g., like 4.5%. You need to divide
it by 100.)
Write a test program that creates an Account object with an account ID of 1122, a
balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw method to
withdraw $2,500, use the deposit method to deposit $3,000, and print the balance, the
monthly interest, and the date when this account was created. 

```
package javaapplication1;
import java.util.Date;


public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    public static void main(String[] args) {
        Account obj = new Account(1122,20000.0);
    }
    
    public Account(int id1, double balance1){
        id = id1;
        balance = balance1;
    }
    
    /*public void dateCreated(){
        dateCreated = new Date;
    }*/
    
    public double getMonthlyInterestRate(){
        return  balance * getMonthlyInterest();
    }
    
    public double getMonthlyInterest() {
        return  annualInterestRate / 12;
    }
    
    public void withdraw(double gg) {
        if( balance- gg >= 0){
            balance-=gg;
        }
        System.out.println("balance is "+ balance);
    }
            
    public void deposit(double gg) {
        balance += gg;
        System.out.println("balance is "+ balance);
    }
  
}
```
