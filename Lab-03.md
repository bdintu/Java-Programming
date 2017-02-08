#Programming Exercise 6.26 p.262 (Palindromic prime)

```java
class Main
{
    public static void main (String[] args)
    {
        final int sizeArrary = (int)1e4;
        int[] arraryPrime = new int[sizeArrary];

        int tailIndexPrime = 0;
        arraryPrime[ tailIndexPrime++ ] = 2;

        int checkIndexPrime;

        int numStart = 3;
        int numCurrent;
        int numStop = (int)1e5;


        for ( numCurrent = numStart; numCurrent<=numStop; numCurrent+=2 )
        {
            for ( checkIndexPrime = 0; checkIndexPrime < tailIndexPrime; checkIndexPrime++ )
            {
                if ( numCurrent % arraryPrime[ checkIndexPrime ] == 0 ){
                    break;
                }
            }

            if ( checkIndexPrime == tailIndexPrime ){
                arraryPrime[ tailIndexPrime++ ] = numCurrent;
            }
        }

		put(arraryPrime, tailIndexPrime);
    }

    public static boolean checkPararindom( int prime )
    {
        int num = prime;
        int rev = 0;

        while ( num>0 ){
            rev = rev*10  + (num%10);
            num /= 10;
        }

        if ( prime == rev ){
            return true;
        }

        return false;
    }
    
    public static void put( int[] arraryPrime, int tailIndexPrime)
    {
    	int line = 0;

        for (int i=0; i<tailIndexPrime; i++ )
        {
            if ( checkPararindom( arraryPrime[i] ) )
            {
                System.out.print( arraryPrime[i] + " ");
                line++;
            }

            if( line == 10 ){
                line = 0;
                System.out.println();
            }
        }
    }
}
```

#Programming Exercise 7.31 p.283 (Merge two sorted lists) 

```java
import java.util.Scanner;

class Main
{
    public static void main (String[] args)
    {
        int[] a = get(1);
        int[] b = get(2);
        int[] c = merge(a, b);
        sort(c);
        put(c);
    }

    public static int[] get(int haha){
        System.out.print("Enter list"+haha+": ");
        Scanner sc = new Scanner(System.in);

        int firstArrary = sc.nextInt();
        int sizeArrary = sc.nextInt();
        int[] arrary = new int[sizeArrary];
        arrary[0] = firstArrary;
        arrary[1] = sizeArrary;
        for (int i =2; i<sizeArrary; i++){
            arrary[i] = sc.nextInt();
        }

        return arrary;
    }

    public static void sort(int[] arrary){
        int tmp;
        int len = arrary.length;

        for( int i=0; i<len-1; i++){
            for( int j=i+1; j<len; j++){
                if(arrary[i]>arrary[j]){
                    tmp = arrary[i];
                    arrary[i] = arrary[j];
                    arrary[j] = tmp;
                }
            }
        }
    }

    public static int[] merge(int[] a, int[] b) {

        int[] answer = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length)  
			answer[k++] = a[i] < b[j] ? a[i++] :  b[j++];

        while (i < a.length)  
			answer[k++] = a[i++];

        while (j < b.length)    
            answer[k++] = b[j++];

       return answer;

    }

    public static void put(int[] a){
        System.out.print("The merged list is ");
        for( int i: a){
            System.out.print(i + "  ");
        }
    }
}
```

#Programming Exercise 8.14 p.310 (Explore matrix)

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size for the matrix:");
        int size = sc.nextInt();
        
        int[][] a = new int[size][size];
        fill(a);
        put(a);
        check(a);
    }
    
    public static void fill(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int)(Math.random() * 2);
            }
        }
    }
    
    public static void put(int a[][]) {
        for (int i[]: a) {
            for (int j: i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public static void check(int a[][]) {
        
        boolean found = false;
        int result;
        
        // Row
        for (int i = 0; i < a.length; i++) {
            result = checkRow(i, a);
            if (result != 2) {
                found = true;
                System.out.println("All " + result + "s on row " + i);
            }
        }
        if (found == false) {
            
            System.out.println("No same numbers on a row");
        }
        
        // Column
        found = false;
        for (int i = 0; i < a.length; i++) {
            result = checkCol(i, a);
            if (result != 2) {
                found = true;
                System.out.println("All " + result + "s on column " + i);
            }
        }
        if (found == false) {
            
            System.out.println("No same numbers on a column");
        }
        
        // Diagonal
        int intSuper = checkSuperDia(a);
        int intSub = checkSubDia(a);
        
        if (intSuper != 2) {
            System.out.println("All " + intSub + "s on superdiagonal");
            } else {
            System.out.println("No same numbers on the superdiagonal");
        }
        
        if (intSub != 2) {
            System.out.println("All " + intSub + "s on subdiagonal");
            } else {
            System.out.println("No same numbers on the subdiagonal");
        }
        
    }
    
    public static int checkRow(int intRow, int a[][]) {
        
        for (int i = 1; i < a[intRow].length; i++) {
            if (a[intRow][i] != a[intRow][0])
            return 2;
        }
        return a[intRow][0];
        
    }
    
    public static int checkCol(int intCol, int a[][]) {
        for (int i = 1; i < a.length; i++) {
            if (a[i][intCol] != a[0][intCol])
            return 2;
        }
        return a[0][intCol];
    }
    
    public static int checkSuperDia(int a[][]) {
        for (int i = 1; i < a.length; i++) {
            if (a[i][i] != a[0][0])
            return 2;
        }
        return a[0][0];
    }
    

    public static int checkSubDia(int a[][]) {
        int size = a.length - 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i][size - i] != a[0][size])
            return 2;
        }
        return a[0][0];
    }
    
}
```
