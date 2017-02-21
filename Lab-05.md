#Programming Exercise 11.3 p.445 (Subclasses of Account)

```java
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Account account = new Account( 1122, 20000.0, 4.5 );
        account.withdraw(2500.0);
        account.deposit(3000.0);
        System.out.println(account.toString());

        SavingsAccount saving = new SavingsAccount( 1122, 20000.0, 4.5 );
        System.out.println(saving.toString());

        CheckingAccount checking = new CheckingAccount( 1122, 20000.0, 4.5 );
        System.out.println(saving.toString());
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

    public Account( int id, double balance, double annualInterestRate ){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
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

    public String toString(){
        return "The balance is " + getBalance() + "\n" + "the monthly interest is " + getMonthlyInterest() + "\n" + "the date when this account was created is "+ getDateCreated() + "\n";
    }
}

class SavingsAccount extends Account {

    public SavingsAccount(int id, double balance, double annualInterestRate) {
        super( id, balance, annualInterestRate);
    }

}

class CheckingAccount extends Account {

    public CheckingAccount(int id, double balance, double annualInterestRate) {
        super( id, balance, annualInterestRate);
    }

}
```

#Programming Exercise 11.8 p.446 (New Account class)

```java
import java.util.ArrayList;
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
    private String name;
    private double balance;
    private double annualInterestRate;
    ArrayList transactions = new ArrayList();
    private Date dateCreated = new Date();
    
    public Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }

    public Account( int id, double balance, double annualInterestRate ){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
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

    public String toString(){
    	return "The balance is " + getBalance() + "\n" + "the monthly interest is " + getMonthlyInterest() + "\n" + "the date when this account was created is "+ getDateCreated() + "\n";
    }
}

class Transaction {
	
	private char type;
	private double amount;
	private double balance;
	private String description;
	private Date dateCreated = new Date();
	
	public Transaction(char type, double amount, double balance, String description){
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}

    public void withdraw(double money) {

        if( balance - money >= 0){
            balance -=money;
        }
    }

    public void deposit(double money) {
        balance += money;
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
}
```

Programming Exercise 11.2 p.445

```java
```
