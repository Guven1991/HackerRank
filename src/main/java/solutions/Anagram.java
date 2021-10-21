package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {
        boolean status = true;
        String A = a.toLowerCase();
        String B = b.toLowerCase();
        if (A.length() != B.length()) {
            status = false;
        } else {
            char[] Arrays1 = A.toCharArray();
            char[] Arrays2 = B.toCharArray();
            Arrays.sort(Arrays1);
            Arrays.sort(Arrays2);

            status = Arrays.equals(Arrays1, Arrays2);
        }
        return status;
    }
}
