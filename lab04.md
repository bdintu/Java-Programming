#Programming Exercise 9.7 p.361 (The Account class)

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
