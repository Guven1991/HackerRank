package solutionss;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list=new LinkedList<>();

        int listLength = scanner.nextInt();
        for (int i = 0; i < listLength; i++) {
            int assignValueToList = scanner.nextInt();
            list.add(assignValueToList);
        }
        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            String action = scanner.next();
            if(action.equals("Insert")){
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                list.add(index, value);
            }else {
                int index = scanner.nextInt();
                list.remove(index);
            }
        }
        scanner.close();

        for(Integer num : list){
            System.out.println(num + " ");
        }
    }
}
