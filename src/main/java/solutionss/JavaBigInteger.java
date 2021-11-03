package solutionss;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaBigInteger {
    public static void main(String[] args) throws IOException {
        JavaBigInteger bigInteger = new JavaBigInteger();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();

        bigInteger.calculate(a,b);
    }

    public void calculate(String a,String b){
        BigInteger a1 = new BigInteger(a);
        BigInteger b1 = new BigInteger(b);
        BigInteger result1,result2;

        result1 =a1.add(b1);
        result2=a1.multiply(b1);

        System.out.println(result1);
        System.out.println(result2);

    }
}
