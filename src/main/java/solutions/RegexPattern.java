package solutions;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            testCases--;
        }

    }
}
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int N = scan.nextInt();
//        scan.nextLine();
//        for (int i = 0; i < N; i++) {
//            String regex = scan.nextLine();
//            try {
//                Pattern.compile(regex);
//                System.out.println("Valid");
//            }
//            catch (PatternSyntaxException e) {
//                System.out.println("Invalid");
//            }
//        }
//    }