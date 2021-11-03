package solutionss;

import java.util.Arrays;


public class ExampleeeDe {
    public static void main(String[] args) {
        int [] array = {45,12,85,32,89,39,69,44,42,1,6,8};
        Arrays.sort(array);
        for (int i = array.length-1; i>=0; i--) {
            System.out.println(array[i]);
        };


    }
}
