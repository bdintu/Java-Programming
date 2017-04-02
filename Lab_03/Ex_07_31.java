/*
Programming Exercise 7.31 p.283 (Merge two sorted lists) 
 */
package lab_03;

import java.util.Scanner;

class Ex_07_31 {

    public static void main(String[] args) {
        int[] a = scan(1);
        int[] b = scan(2);
        int[] c = merge(a, b);
        sort(c);
        print(c);
    }

    public static int[] scan(int haha) {
        System.out.print("Enter list" + haha + ": ");
        Scanner sc = new Scanner(System.in);

        int firstArrary = sc.nextInt();
        int sizeArrary = sc.nextInt();
        int[] arrary = new int[sizeArrary];
        arrary[0] = firstArrary;
        arrary[1] = sizeArrary;
        for (int i = 2; i < sizeArrary; i++) {
            arrary[i] = sc.nextInt();
        }

        return arrary;
    }

    public static void sort(int[] arrary) {
        int tmp;
        for (int i = 0; i < arrary.length - 1; i++) {
            for (int j = i + 1; j < arrary.length; j++) {
                if (arrary[i] > arrary[j]) {
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

        while (i < a.length && j < b.length) {
            answer[k++] = a[i] < b[j] ? a[i++] : b[j++];
        }

        while (i < a.length) {
            answer[k++] = a[i++];
        }

        while (j < b.length) {
            answer[k++] = b[j++];
        }

        return answer;

    }

    public static void print(int[] a) {
        System.out.print("The merged list is ");
        for (int i : a) {
            System.out.print(i + "  ");
        }
    }
}
