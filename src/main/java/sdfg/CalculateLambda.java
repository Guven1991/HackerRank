package sdfg;

import java.util.ArrayList;
import java.util.List;

public class CalculateLambda {
    int sum = 0;
    int multiply = 1;
    int[] squares = new int[10];

    public static void main(String[] args) {

        CalculateLambda calculateLambda = new CalculateLambda();

        pickEvenNumber(10, (int n) -> calculateLambda.sum += n);
        System.out.println("sum : " + calculateLambda.sum);

        pickEvenNumber(10, (int n) -> calculateLambda.multiply *= n);
        System.out.println("multiply : " + calculateLambda.multiply);

        pickEvenNumber(10,(int n) -> calculateLambda.squares[n] = n*n);
        for (int i : calculateLambda.squares) {
            System.out.print(i+ " ");
        }
    }

    public static void pickEvenNumber(int n, EvenNumberOperation operation) {
        for (int i = 1; i < n; i++) {
            operation.operate(i);
        }
    }

    @FunctionalInterface
    public interface EvenNumberOperation {
        void operate(int n);
    }
}
