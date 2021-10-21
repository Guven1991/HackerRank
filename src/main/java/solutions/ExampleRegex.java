package solutions;

public class ExampleRegex {

    public static void main(String args[]) {
        String Str = new String("Welcome to Tutorialspoint.com");

        System.out.print("Return Value 1:" );
        System.out.println(Str.matches("(.*)Tutorials(.*)"));

        System.out.print("Return Value 2:" );
        System.out.println(Str.matches("Welcome to Tutorialspoint.com"));

        System.out.print("Return Value 3:" );
        System.out.println(Str.matches("Welcome(.*)"));

        System.out.print("Return Value 4:" );
        System.out.println(Str.matches("(.*)co"));

    }
}
