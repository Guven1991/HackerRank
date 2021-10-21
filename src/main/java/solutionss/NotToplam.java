package solutionss;

import java.util.Scanner;

public class NotToplam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam =0;
        int sayac=1;

        while(sayac<=10){

            int ogrenciNotu = scanner.nextInt();
            toplam= toplam +ogrenciNotu;
            sayac++;
        }
        System.out.println(toplam/10);
    }
}
