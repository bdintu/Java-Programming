#Programming Exercise 9.7 p.361 (The Account class)

```java
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Account account = new Account( 1122, 20000.0, 4.5 );
        account.withdraw(2500.0);
        account.deposit(3000.0);
        System.out.println(account.toString());
    }
}

class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){
		this(0, 0.0, 0.0);
    }

    public Account( int id, double balance, double annualInterestRate ){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new Date(); 
    }

    public void withdraw(double amount) {

        if( amount  <= balance){
            balance -= amount;
        }
    }

    public void deposit(double amount) {

        if( amount>=0 ){
            balance += amount;
        }
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
    
    public String toString(){
    	return "The balance is $" + balance + "\nthe monthly interest is " + getMonthlyInterest() + "%\nThe date when this account was created is "+ dateCreated +"\n";
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

        Account[] account = new Account[size];
        for( int i= 0; i<size ; i++ ) {
            account[i] = new Account();
        }

        while(true) {
        	
            System.out.println("Enter an id:");

            int i = sn.nextInt();
            int j = 0;

            while( j!=4 ) {
                
				account[i].printMenu();
                j = sn.nextInt();

                if( j == 1 ){
                	
					account[i].printBalance();
                } else if ( j == 2 ) {

                    System.out.println("Enter an amount to withdraw:");
                    account[i].withdraw(  sn.nextInt()  );

                } else if ( j== 3 ) {

                    System.out.println("Enter an amount to deposit:");
                    account[i].deposit(  sn.nextInt()  );
                }
            }
        }
   }
}

class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){
		this(0, 0.0, 0.0);
    }
    
    public Account( int id, double balance, double annualInterestRate ){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new Date(); 
    }

    public void withdraw(double amount) {

        if( amount  <= balance){
            balance -= amount;
        }
    }

    public void deposit(double amount) {

        if( amount>=0 ){
            balance += amount;
        }
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
	
	public static void printMenu() {
		System.out.println("Main menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
		System.out.println("Enter a choice:");
	}
}
```
