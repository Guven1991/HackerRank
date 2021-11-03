package solutionss;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        JavaPrimalityTest javaPrimalityTest = new JavaPrimalityTest();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        javaPrimalityTest.isPrime(n);
        bufferedReader.close();
    }

    public void isPrime(String n){

        BigInteger bigInteger = new BigInteger(n);
        boolean isPrimeNumber =bigInteger.isProbablePrime(1);
        if(isPrimeNumber){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }

    }
}
