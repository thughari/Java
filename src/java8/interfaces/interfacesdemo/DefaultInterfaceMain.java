package java8.interfaces.interfacesdemo;

import java8.interfaces.DefaultInterface;

public class DefaultInterfaceMain implements DefaultInterface {

    @Override
    public void defaultMethod() {
        System.out.println("Hello from Default Interface Main");
    }

    public static void main(String[] args) {
        DefaultInterfaceMain main = new DefaultInterfaceMain();
        main.defaultMethod();
    }
}
