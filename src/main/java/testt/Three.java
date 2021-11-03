package testt;

interface One {
    default void method() {
        System.out.println("One");
    }
}

interface Two {
    default void method () {
        System.out.println("Two");
    }
}
public class Three implements One,Two{
    @Override
    public void method() {

    }
}
