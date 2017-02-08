#Programming Exercise 9.7 p.361 (The Account class)

```
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public static void main(String[] args) {
        Account obj = new Account(1122, 20000.0, 4.5);
        obj.withdraw(2500.0);
        obj.deposit(3000.0);

        System.out.println("the balance is "+ obj.getBalance() );
        System.out.println("the monthly interest is "+ obj.getMonthlyInterest() );
        System.out.println("the date when this account was created is "+ obj.getdateCreated() );
    }

    public void Account(int id1, double balance1, double annualInterestRate1){
        id = id1;
        balance = balance1;
        annualInterestRate = annualInterestRate1;
    }

    public void dateCreated(){
        dateCreated =  new Date;
    }
    
    public void withdraw(double gg) {
        if( balance- gg >= 0){
            balance-=gg;
        }
    }

    public void deposit(double gg) {
        balance += gg;
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
    
    public Date getdateCreated() {
        return  dateCreated;
    }
}
```
