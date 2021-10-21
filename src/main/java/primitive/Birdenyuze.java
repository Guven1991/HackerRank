package primitive;

import java.util.ArrayList;
import java.util.List;

public class Birdenyuze {
    public static void main(String[] args) {

        List<Integer> tekSayilar = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int toplam = 0;
        for (int i = 10; i <=20; i++) {
            if (i % 3 == 0) {
                toplam += i;
            }

        }
        System.out.println(toplam);
    }
}
