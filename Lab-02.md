#Programming Exercise 3.5 p.131 

```java
import java.util.Scanner;
public class Main{
	public static void main(String args[]){
		String a[] = {"Sun", "Mon", "Tues", "Wednes", "Thurs", "Fri", "Satur"};
		Scanner sn = new Scanner(System.in);
		
		System.out.print("Enter today's day:");
		int d = sn.nextInt();
		
		System.out.print("Enter the number of days elapsed since today:");
		int n = sn.nextInt();
		
		System.out.print("Today is "+a[d]+"day and the future day is "+a[(d+n)%7]+"day");
	}
}
```

#Programming Exercise 3.17 p.133

```java
import java.util.Scanner;

public class Main {

    public static void main(String args[]){

		String a[] = {"scissor", "rock", "paper"};
		int random = (int)(Math.random()*3);

    	System.out.print("scissor (0), rock (1), paper (2):");
    	
    	Scanner sn = new Scanner (System.in);
    	int me = sn.nextInt();
    	
		System.out.print("The computer is "+a[random]);
		System.out.print(" You are "+a[me]+".");
		
    	if( me==random ) {
			System.out.print("tooIt is a draw");
    	} else if(me==0&&random==1){
        	System.out.print("You lose");
    	} else if(me==0&&random==2){
        	System.out.print("You win");
    	} else if(me==1&&random==0){
        	System.out.print("You win");
    	} else if(me==1&&random==2){
        	System.out.print("You lose");
    	} else if(me==2&&random==0){
        	System.out.print("You lose");
    	} else if(me==2&&random==1){
        	System.out.print("You win");
		}
    }
}
```

#Programming Exercise 4.24 p.178

```java
import java.util.Scanner;
public class Main{
	public static void main(String args[]){
		Scanner sn = new Scanner(System.in);
		String a[] = new String[3];
		String w[] = {"first", "second", "third"};
		
		for(int i=0; i<3; i++){
			System.out.print("Enter the "+ w[i]+ " city:");
			a[i] = sn.nextLine();
		}
		
		for(int i=0; i<2; i++){
			for(int j=1; j<3; j++){
				if(a[i].charAt(0)>a[j].charAt(0)){
					String tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		
		System.out.print("The three cities in alphabetical order are");
		
		for(int i=0; i<3; i++){
			System.out.print(" " + a[i])
		}
		
	}
}
```

#Programming Exercise 5.17 p.215

```java
import java.util.Scanner;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of lines:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++){
			for(int j=7; j>i; j--){
				System.out.print("  ");
			}
			for(int j=i; j>=1; j--){
				System.out.print(j+" ");
			}
			for(int j=2; j<=i; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
```

#Extra Exercise (Math Olympiad)

```java
public class Main {

  public static void main(String[] args) {

    int a=1, b=3, n=0;
    for(int i=0; i<100; i++){
        System.out.print(a+" "+b+" ");
        a+=n+=2;
        b+=3;
    }
  }
}
```
