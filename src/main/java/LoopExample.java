import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LoopExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int result=a;

            for (int j = 0; j < n; j++) {
                double x = (Math.pow(2, j) * b);
                result += x;
                System.out.print(result +" ");
            }
            System.out.println();
        }

        in.close();
    }
}
