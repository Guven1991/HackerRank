package solutions;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String original = scanner.next();
        String reverse = "";

        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
