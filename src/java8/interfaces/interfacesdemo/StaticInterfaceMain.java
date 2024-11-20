package java8.interfaces.interfacesdemo;

import java8.interfaces.StaticInterface;

public class StaticInterfaceMain implements StaticInterface {
    @Override
    public void myMethod() {
        System.out.println("Hello from Abstract method");
    }

    public static void main(String[] args) {
        StaticInterface.staticMethod();
        StaticInterfaceMain main = new StaticInterfaceMain();
        main.myMethod();
    }
}
