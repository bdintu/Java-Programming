#Programming Exercise 11.3 p.445 (Subclasses of Account)

```java
import java.util.Date;

public class Main {

    public static void main(String[] args) {

		Account account = new Account( 1122, 20000.0, 4.5 );
		SavingsAccount saving = new SavingsAccount( 1123, 20000.0, 4.5 );
		CheckingAccount checking = new CheckingAccount( 1124, 20000.0, 4.5, -10);

        account.withdraw(2500.0);
        account.deposit(3000.0);

        saving.withdraw(2500.0);
        saving.deposit(3000.0);

        checking.withdraw(2500.0);
        checking.deposit(3000.0);
        
        System.out.println(account.toString());
        System.out.println(saving.toString());
		System.out.println(checking.toString());
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
    
    public void setBalance(double balance){
    	this.balance = balance;
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
        return "The balance is $" + balance + "\nthe monthly interest is " + getMonthlyInterest() + "%\nthe date when this account was created is "+ dateCreated + "\n";
    }
}

class SavingsAccount extends Account {
	
	public SavingsAccount() {
		super();
	}

    public SavingsAccount(int id, double balance, double annualInterestRate) {
        super( id, balance, annualInterestRate);
    }
    
	public void withdraw(double amount) {
		
		if (amount <= getBalance()) {
			setBalance( getBalance() - amount);
		} else {
			System.out.println("Savings Account overdrawn");
		}
	}
}

class CheckingAccount extends Account {
	
	private double overdraft;
	
	public CheckingAccount() {
		super();
		overdraft = 0;
	}

    public CheckingAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super( id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

	public void withdraw(double amount) {
		if (getBalance() - amount >= overdraft) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println("Checking Amount overdraft limit");
	}

	public String toString() {
		return super.toString() + "Overdraft limit $" + overdraft + "\n";
	}
}
```

#Programming Exercise 11.8 p.446 (New Account class)

```java
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Account account = new Account( 1122, 1000.0, 1.5, "George" );
        account.deposit(30.0);
        account.deposit(40.0);
        account.deposit(50.0);
        account.withdraw(5.0);
        account.withdraw(4.0);
        account.withdraw(2.0);
        
        System.out.println(account.toString());
        for(int i=0; i<account.getTransactions().size(); i++){
        	System.out.print("id " + i + " : ");
        	System.out.println( account.getTransactions().get(i).toString() );
        }
    }
}

class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private String name;
    private ArrayList<Transaction> transactions;
    private Date dateCreated;

    public Account(){
        this(0, 0.0, 0.0, "");
    }

    public Account( int id, double balance, double annualInterestRate, String name ){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.name = name;
        transactions = new ArrayList<Transaction>();
        dateCreated = new Date(); 
    }

    public void withdraw(double amount) {

        if( balance - amount >= 0){
            balance -= amount;
            transactions.add(new Transaction('W', amount, balance, "Withdrawal"));
        }
    }

    public void deposit(double amount) {

        if(amount >= 0){
            balance += amount;
            transactions.add(new Transaction('D', amount, balance, "Deposit"));
        }
    }
    
	public ArrayList<Transaction> getTransactions() {
		return transactions;
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
        return "Accountholder name is " + name + "\nthe monthly interest is " + getMonthlyInterest() + "%\nThe balance is $" + balance + "\nthe date when this account was created is "+ dateCreated + "\n";
    }
}

class Transaction {

    private char type;
    private double amount;
    private double balance;
    private String description;
    private Date dateCreated;

    public Transaction(char type, double amount, double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        dateCreated = new Date(); 
    }

    public void withdraw(double amount) {

        if( balance - amount >= 0){
            balance -= amount;
        }
    }

    public void deposit(double amount) {

        if(amount >= 0){
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
    
    public String toString(){
        return "Date" + dateCreated + ", Type "+ type + ", Amount " + amount + ", Balance " + balance + ", Description " + description +"\n";
    }
}
```

Programming Exercise 11.2 p.445

```java
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("A", "Bangkok", "0998887776", "59019999@kmitl.ac.th");
        Student student = new Student("B", "Chiang Mai", "0998886274", "59018888@kmitl.ac.th", "freshman");
        Employee employee = new Employee("C", "Phuket", "0998880341","59017777@kmitl.ac.th", "Network Lab", 12000.0);
        Faculty faculty = new Faculty("D", "Korat", "0998889402","59016666@kmitl.ac.th", "KMITL Computer Faculty", 25000.0, "10.00-16.00", "Trainee");
        Staff staff = new Staff("E", "Ubon", "0998880341","59015555@kmitl.ac.th", "KMITL Computer Faculty", 18000.0, "Title");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}

class Person {
	
    private String name;
    private String address;
    private String phone;
    private String email;

    public Person() {
        this("","","","");
    }

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return "Name " + name + "\nAddress " + address + "\nPhone number " + phone + "\nEmail address " + email + "\n";
    }
}

class Student extends Person {
	
    private String status;

    public Student(String name, String address, String phone, String email, String status){
        super(name, address, phone, email);
        this.status = status;
    }

    public String toString() {
        return super.toString() + "Status " + status + "\n";
    }
}

class Employee extends Person {
	
	private String office;
	private double salary;
	private Date dateHired;
	
	public Employee(String name, String address, String phone, String email, String office, double salary){
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = new Date();
	}
	
	public String toString(){
		return super.toString() + "Office " + office + "\nSalary $" + salary + "\nDate Hired " + dateHired + "\n";
	}

}

class Faculty extends Employee {
	
	private String officeHours;
	private String rank;
	
	public Faculty(String name, String address, String phone, String email, String office, double salary, String officeHours, String rank) {
		super(name, address, phone, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public String toString(){
		return super.toString() + "Office Hours " + officeHours + "\nRank " + rank + "\n";
	}

}

class Staff extends Employee {
	
	private String title;
	
	public Staff(String name, String address, String phone, String email, String office, double salary, String title) {
		super(name, address, phone, email, office, salary);
		this.title = title;
	}
	
	public String toString() {
		return super.toString() + "Title " + title +  "\n";
	}

}
```
