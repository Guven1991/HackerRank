package solutionss;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();

        triangle.triangleWithStar();
    }

    public void triangleWithStar(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen Oluşturmak istediğiniz eşkenar üçgenin kenar uzunluğunu giriniz : ");
        int number = sc.nextInt();

        for (int i = 1; i < 2*number; i++) {
            for (int j = 0; j < (2*number-1)-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            for (int j = 0; j < (2*number-1)-i; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }
        System.out.println("!!!!TEBRİKLER!!!! iyi halt yediniz :)");

    }
}

