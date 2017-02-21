#Programming Exercise 9.7 p.361 (The Account class)

```java
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Account obj = new Account( 1122, 20000.0, 4.5 );
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

    public Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }
    
    public Account( int initID, double initBalance, double initAnnualInterestRate ){
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
```

#Programming Exercise 10.7 p.401 (Game: ATM machine) 

``` java
import java.util.Scanner;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sn = new Scanner(System.in);
    	
    	final int size = 10;

        Account[] obj = new Account[size];
        for( int i= 0; i<size ; i++ ) {
            obj[i] = new Account();
        }

        while( true) {
        	
            System.out.println("Enter an id:");

            int i = sn.nextInt();
            int j = 0;

            while( j!=4 ) {
                
				obj[i].printMenu();
                j = sn.nextInt();

                if( j == 1 ){
                	
					obj[i].printBalance();
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

    public Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }
    
    public Account( int initID, double initBalance, double initAnnualInterestRate ){
        id = initID;
        balance = initBalance;
        annualInterestRate = initAnnualInterestRate;
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
	
	public void printMenu() {
		System.out.println("Main menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
		System.out.println("Enter a choice:");
	}
}
```
