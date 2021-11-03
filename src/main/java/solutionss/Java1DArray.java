package solutionss;

import java.util.Scanner;

public class Java1DArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n+1];

        for (int i = 1; i < n+1; i++) {
            a[i]= scan.nextInt();
        }
//        System.out.println(a.length);
        scan.close();

        // Prints each sequential element in array a
        for (int i = 1; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
