package solutions;

import java.util.Scanner;

public class MyRegexExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String IP = scan.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}
class MyRegex{
    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = num + "." +  num + "." +  num + "." + num;
}
