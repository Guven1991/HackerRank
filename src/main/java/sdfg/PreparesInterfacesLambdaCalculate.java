package sdfg;

import java.util.function.BiFunction;

public class PreparesInterfacesLambdaCalculate {
    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> adder = (sum1,sum2) -> sum1+sum2;
        System.out.println(adder.apply(5,6));

        BiFunction<Integer,Integer,Integer> subtractor = (sum1,sum2) -> sum1-sum2;
        System.out.println(subtractor.apply(5,6));

        BiFunction<Integer,Integer,Integer> multiply = (sum1,sum2) -> sum1*sum2;
        System.out.println(multiply.apply(5,6));

        BiFunction<Integer,Integer,Double> divider = (sum1,sum2) -> (double)sum1/sum2;
        System.out.println(divider.apply(5,6));
    }
}
