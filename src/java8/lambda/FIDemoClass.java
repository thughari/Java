package java8.lambda;

import java8.interfaces.FIDemo;

import java.util.Arrays;

public class FIDemoClass {
    public int square(int a){
        return a*a;
    }
    public static void main(String[] args) {
        //ex 1
        FIDemo fiDemo1 = (a) -> a*a;
        System.out.println(fiDemo1.square(5));

        //ex 2
        FIDemoClass fiDemoClass = new FIDemoClass();
        FIDemo fiDemo2 = fiDemoClass::square; //or a->fiDemoClass.square(a);
        System.out.println(fiDemo2.square(10));

        //Reference to an Instance Method of an Arbitrary Object of a Particular Type
        String[] stringArray = { "Barbara", "James", "Mary", "John",
                "Patricia", "Robert", "Michael", "Linda" };
        Arrays.sort(stringArray, String::compareToIgnoreCase);
    }
}
