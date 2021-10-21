package sdfg;

public class Selam {
    public static void main(String[] args) {
        greeting((x) -> x + "تحية", "Merhaba :");
        greeting((y) -> y + "hello", "Merhaba :");

        greeting((s) ->"hello","mfds");

    }
    public void hello(String s ){

         System.out.println("hello");
    }


    public static void greeting(Selamlama s, String str) {
        String result = s.selamla(str);
        System.out.println(result);
    }

    @FunctionalInterface
    interface Selamlama {
        String selamla(String str);

    }
}
