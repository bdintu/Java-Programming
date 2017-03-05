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

#4.3

```
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
double a,b,c,d,e,f;
Scanner sc = new Scanner(System.in);
a = sc.nextDouble();
b = sc.nextDouble();
c = sc.nextDouble();
d = sc.nextDouble();
e = sc.nextDouble();
f = sc.nextDouble();
LinearEquation heeeeee = new LinearEquation(a,b,c,d,e,f);
if(heeeeee.isSolvable()==true){
System.out.println("x is");
System.out.println(heeeeee.getX());
System.out.println("y is");
System.out.println(heeeeee.getY());
}
else{
System.out.println("The equation has no solution");
}
}

}
class LinearEquation{
private double a,b,c,d,e,f;

public LinearEquation(double a, double b, double c, double d, double e, double f) {
this.a = a;
this.b = b;
this.c = c;
this.d = d;
this.e = e;
this.f = f;
}
public boolean isSolvable(){
if((a*d-b*c)!=0){
return true;
}
else{return false;}
}
public void setA(double a) {
this.a = a;
}

public void setB(double b) {
this.b = b;
}
public double getX(){
double z,y,x;
z = ((e*d)-(b*f));
y = ((a*d)-(b*c));
x = z/y;
return x;
}
public double getY(){
double z,y,x;
z = ((f*a)-(e*c));
x = ((a*d)-(b*c));
y = z/x;
return y;
}
public void setC(double c) {
this.c = c;
}

public void setD(double d) {
this.d = d;
}

public void setE(double e) {
this.e = e;
}

public void setF(double f) {
this.f = f;
}

public double getA() {
return a;
}

public double getB() {
return b;
}

public double getC() {
return c;
}

public double getD() {
return d;
}

public double getE() {
return e;
}

public double getF() {
return f;
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
