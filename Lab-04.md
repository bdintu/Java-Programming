#Programming Exercise 9.7 p.361 (The Account class)

```
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Account obj = new Account();
        obj.setDefult( 1122, 20000.0, 4.5 );
        obj.withdraw(2500.0);
        obj.deposit(3000.0);

        System.out.println("the balance is "+ obj.getBalance() );
        System.out.println("the monthly interest is "+ obj.getMonthlyInterest() );
        System.out.println("the date when this account was created is "+ obj.getdateCreated() );
    }
}

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();

    Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }
    
    public setDefult( int id1, double balance1, double annualInterestRate1){
        id = id1;
        balance = balance1;
        annualInterestRate = annualInterestRate1;
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

package main;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account[] obj = new Account[10];
        for(int i= 0; i<10 ;i++) {
            obj[i] = new Account();
        }
        Scanner sn = new Scanner(System.in);

        int i = 0, j =0;
        while( true) {
            System.out.println("Enter an id:");
            j = 0;
            i = sn.nextInt();
            
            while( j!=4 ) {
                
                System.out.println("Main menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.println("Enter a choice:");

                j = sn.nextInt();

                if( j == 1 ){
                       System.out.println("The balance is "+ obj[i].getBalance() );
                } else if ( j == 2 ) {
                    System.out.println("Enter an amount to withdraw:");
                    obj[i].withdraw(  sn.nextInt()  );
                } else if ( j== 3 ) {
                    System.out.println("Enter an amount to deposit:");
                    obj[i].deposit(  sn.nextInt()  );
                }
            }
        }   
        
   }
}

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();

    Account(){
        id = 0;
        balance = 100;
        annualInterestRate = 0;
    }

    public setDefult( int id1, double balance1, double annualInterestRate1){
        id = id1;
        balance = balance1;
        annualInterestRate = annualInterestRate1;
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
