package solutionss;

import java.util.Scanner;

public class ScannerHas {
    public static void main(String[] args) {
        int count = 1;
        Scanner scanner = new Scanner(System.in);
       while (scanner.hasNext()) {
           String s = scanner.nextLine();
           System.out.println(count + " " + s);
           count++;
       }

    }


//    public static void main(String[] args) {
//        check(1);  // call check method
//    }
//
//    public static void check(int count) {
//        Scanner s = new Scanner(System.in);
//        if (s.hasNextLine()) {
//            String ns = s.nextLine();
//            System.out.println(count + " " + ns);
//            count++;
//            check(count);
//        }
//    }
}
