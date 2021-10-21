public class MathLambdaTest{
    public static void main(String[] args) {

        MathExample adder = (double arg1, double arg2) -> {return arg1+arg2;};
        doMath(adder,5,2);

        MathExample multipler = (double arg1, double arg2) -> {return arg1*arg2;};
        doMath(multipler,6,8);
        System.out.println("*************");
        doMath((double arg1,double arg2) -> {return arg1/arg2;},8,2);
        System.out.println("*************");
        doMath((arg1,arg2) -> arg1/arg2,4,2);

        MathExample mode = (a, b) -> a%b;
        doMath(mode,2345,2);
        System.out.println(mode);
    }

    public static void doMath(MathExample mathExample, double arg1, double arg2){

    double sonuc = mathExample.calculate(arg1,arg2);

        System.out.println(sonuc);

    }
}
