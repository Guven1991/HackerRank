import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class NumberIfElse {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

//        for (int i = 1; i <= 10; i++) {
//            System.out.println(N + " x " + i + " = " + (N * i));
//        }

        List<Integer> arrayList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        arrayList.forEach((n) -> System.out.print(n+ ", "));

        arrayList.forEach((i) -> System.out.println(N + " x " + i + " = " + (N * i)));

        bufferedReader.close();
    }

}

