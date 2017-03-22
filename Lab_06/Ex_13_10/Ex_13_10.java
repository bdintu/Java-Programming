/*
Programming Exercise 13.10 p.530 (Enable Rectangle comparable)
*/

package Ex_13_10;

public class Ex_13_10 {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 5, "pink", true);
        Rectangle r2 = new Rectangle(5, 3, "blue", false);

        System.out.println("Rectangle1 Area : " + r1.getArea());
        System.out.println("Rectangle2 Area : " + r2.getArea());

        System.out.println("Rectangle1 is " + (r1.equals(r2) ? "" : "not ") + "equal to Rectangle2");
    }
}