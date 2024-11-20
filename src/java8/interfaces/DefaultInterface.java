package java8.interfaces;

public interface DefaultInterface {
    default void defaultMethod(){
        System.out.println("Hello from default method");
    }
}
