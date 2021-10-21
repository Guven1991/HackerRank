package primitive;

import java.util.Scanner;

public class AreaOfAParallelogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen tabanı giriniz");
        int B = scanner.nextInt();
        System.out.println("Lütfen yüksekliği giriniz");
        int H = scanner.nextInt();

        if(B > 0 && H>0){
            System.out.println("Paralel kenarın alanı:");
            int area = B*H;
            System.out.println(area);
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");

        }
    }
}
