package solutionss;

import java.util.function.Function;

public class Composition {
    public static void main(String[] args) {
        composition1();
    }

    public static void composition1(){

        String s1 = "Guven Ayvazoglu    ";
        String s2= "Duru";

        Function<String,String> trim = String ::trim;
        s1 = trim.apply(s1);
        System.out.println(s1);

        Function<String,String> concat = s1::concat;
        s1 = concat.apply(s2);
        System.out.println(s1);

        Function<String,String> toUpperCase = String::toUpperCase;
        s1 = toUpperCase.apply(s1);
        System.out.println(s1);

        Function<String,String> trimAndThenConcatAndThenToUpperCase = trim.andThen(concat).andThen(toUpperCase);
        s1 = trimAndThenConcatAndThenToUpperCase.apply(s2);
        System.out.println(s1);

    }
}
