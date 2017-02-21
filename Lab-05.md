#Programming Exercise 11.3 p.445 (Subclasses of Account)

```java
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Account obj = new Account();
        obj.setDefault( 1122, 20000.0, 4.5 );
        obj.withdraw(2500.0);
        obj.deposit(3000.0);

        obj.printBalance();
        obj.printMonthlyInterest();
        obj.printDateCreated();
    }
}

class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();

    public void Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }

    public void setDefault( int initID, double initBalance, double initAnnualInterestRate ){
        id = initID;
        balance = initBalance;
        annualInterestRate = initAnnualInterestRate;
    }

    public void withdraw(double money) {

        if( balance - money >= 0){
            balance -=money;
        }
    }

    public void deposit(double money) {
        balance += money;
    }

    public double getBalance() {
        return balance;
    }

    public double getMonthlyInterestRate(){
        return  balance * getMonthlyInterest();
    }

    public double getMonthlyInterest() {
        return  annualInterestRate / 12;
    }

    public Date getDateCreated() {
        return  dateCreated;
    }

    public void printBalance() {
        System.out.println("The balance is " + balance );
    }

    public void printMonthlyInterest() {
        System.out.println("the monthly interest is " + getMonthlyInterest() );
    }

    public void printDateCreated() {
        System.out.println("the date when this account was created is "+ getDateCreated() );
    }
}

class SavingsAccount extends Account {

}

class CheckingAccount extends Account {

}
```
