package java8.lambda;

import java8.model.Adder;

import java.util.function.BiFunction;

public class ReferenceToStatic {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> function = Adder::add;
        BiFunction<Integer, Float, Float> function1 = Adder::add;
        BiFunction<Float, Integer, Float> function2 = Adder::add;
        System.out.println(function.apply(1,10));
        System.out.println(function1.apply(10,10.2f));
        System.out.println(function2.apply(10.2f, 11));
    }
}
