/*
Programming Exercise 8.14 p.310 (Explore matrix)
 */
package lab_03;

import java.util.Scanner;

class Ex_08_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size for the matrix : ");
        int size = sc.nextInt();

        int[][] a = new int[size][size];
        fill(a);
        print(a);
        check(a);
    }

    public static void fill(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 2);
            }
        }
    }

    public static void print(int a[][]) {
        for (int i[] : a) {
            for (int j : i) {
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
            if (a[intRow][i] != a[intRow][0]) {
                return 2;
            }
        }
        return a[intRow][0];

    }

    public static int checkCol(int intCol, int a[][]) {
        for (int i = 1; i < a.length; i++) {
            if (a[i][intCol] != a[0][intCol]) {
                return 2;
            }
        }
        return a[0][intCol];
    }

    public static int checkSuperDia(int a[][]) {
        for (int i = 1; i < a.length; i++) {
            if (a[i][i] != a[0][0]) {
                return 2;
            }
        }
        return a[0][0];
    }

    public static int checkSubDia(int a[][]) {
        int size = a.length - 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i][size - i] != a[0][size]) {
                return 2;
            }
        }
        return a[0][0];
    }

}
