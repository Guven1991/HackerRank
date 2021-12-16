package solutionss;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalNumberOfListings = scan.nextInt();

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        for (int i = 0; i < totalNumberOfListings; i++) {

            int size= scan.nextInt();
            ArrayList<Integer> list =new ArrayList();

            for (int j = 0; j < size; j++) {
                int item = scan.nextInt();
                list.add(item);

            }
            mainList.add(list);

        }

        int totalWantToPrint = scan.nextInt();
        for (int k = 0; k < totalWantToPrint; k++) {
            int row = scan.nextInt();
            int col = scan.nextInt();

            try {
                System.out.println(mainList.get(row-1).get(col-1));
            }catch (Exception e){
                System.out.println("ERROR!");
            }
        }

    scan.close();

    }
}
