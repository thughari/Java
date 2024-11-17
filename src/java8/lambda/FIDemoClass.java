package java8.lambda;

import java8.interfaces.FIDemo;

public class FIDemoClass {
    public static void main(String[] args) {
        FIDemo fiDemo = (a) -> a*a;
        System.out.println(fiDemo.square(5));
    }
}
