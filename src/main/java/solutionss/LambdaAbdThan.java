package solutionss;

import java.util.Scanner;
import java.util.function.Function;

public class LambdaAbdThan {
    public static void main(String[] args) {

        composition1();


    }

    public static void composition1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int i =scanner.nextInt();

        Function<Integer,Integer> twice = k -> k*2;
        Function<Integer,Integer> square = k -> k*k;

        int outcome = twice.apply(i);
        outcome= square.apply(outcome);
        System.out.println(outcome);

        int outcome1 =square.apply(i);
        outcome1= twice.apply(outcome1);
        System.out.println(outcome1);

        System.out.println("*************");

        Function<Integer,Integer> twiceAndThanSquare = twice.andThen(square);
        outcome = twiceAndThanSquare.apply(i);
        System.out.println(outcome);

        Function<Integer,Integer> squareAndTwiceThen = square.andThen(twice);
        outcome = squareAndTwiceThen.apply(i);
        System.out.println(outcome);

        Function<Integer,Integer> twiceAndComposeSquare = twice.compose(square);
        outcome = twiceAndComposeSquare.apply(i);
        System.out.println(outcome);

        Function<Integer,Integer> squareAndComposeTwice = square.compose(twice);
        outcome = squareAndComposeTwice.apply(i);
        System.out.println(outcome);

    }



}
