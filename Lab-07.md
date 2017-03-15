#Programming Exercise 12.3 p.488 (ArrayIndexOutOfBoundsException)

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() + (double) 0.5);
        }

        System.out.print("Enter the specified index is out of bounds: ");

        try {
            System.out.println("value is " + array[input.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds.");
        }
    }
}
```

#Programming Exercise 12.5 p.488 (IllegalTriangleException)

```java
import java.util.Scanner;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IllegalTriangleException {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Enter a color: ");
        String color = input.next();

        System.out.print("filled (true / false): ");
        boolean filled = input.nextBoolean();

        try {
            Triangle triangle = new Triangle(side1, side2, side3, color, filled);
            System.out.println(triangle);
        } catch (IllegalTriangleException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class IllegalTriangleException extends Exception {

    private double side1;
    private double side2;
    private double side3;

    public IllegalTriangleException(double side1, double side2, double side3) {
        super("IllegalTriangle sides1: " + side1 + ", sides2: " + side2 + " and sides3: " + side3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
}

abstract class GeometricObject {

    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject() {
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "dateCreated: " + dateCreated + "\ncolor: " + color + "\nfilled: " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}

class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) throws IllegalTriangleException {
        super(color, filled);
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException(side1, side2, side3);
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Area: " + getArea() + "\nPerimeter: " + getPerimeter() + "\n" + super.toString();
    }
}
```

#Programming Exercise 12.31 p.492 (Baby name popularity ranking)

```java
import java.util.Scanner;
import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FileInputStream in;

        System.out.print("Enter the year: ");
        String year = input.nextLine();

        System.out.print("Enter the gender: ");
        String gender = input.nextLine();

        System.out.print("Enter the name: ");
        String name = input.nextLine();

        try {
            in = new FileInputStream("Babynamesranking" + year + ".txt");

            while () {


                if ( ) {
                    System.out.println(name + " is ranked #" + rank + " in year " + year);
                    retrun 0;
                } else {
                    System.out.println("The name " + name + " is not ranked in year " + year);
                }
            }
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
``
