package sdfg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String statement = scan.nextLine();

        List<String> wordList = new ArrayList<>();
        int count = 0;
        for (String word : statement.trim().split("[\\- ,?!@_'.]+")) {
            wordList.add(word);
            if ( word != "") {
                count++;
            }

        }

        System.out.println(count);
        wordList.forEach(System.out::println);


    }
}
