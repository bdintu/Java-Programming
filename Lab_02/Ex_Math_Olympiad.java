/*
Extra Exercise (Math Olympiad)
 */
package Lab_02;

public class Ex_Math_Olympiad {

    public static void main(String[] args) {

        int a = 1, b = 3, n = 0;
        for (int i = 0; i < 100; i++) {
            System.out.print(a + " " + b + " ");
            n += 2;
            a += n;
            b += 3;
        }
    }
}
