package java8.interfaces;

public interface StaticInterface {
    void myMethod();
    static void staticMethod(){
        System.out.println("Hello from static method");
    };
}
