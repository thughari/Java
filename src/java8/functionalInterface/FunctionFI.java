package java8.functionalInterface;

import java.util.function.Function;

public class FunctionFI {
    public static void main(String[] args) {
        Function<Integer, Double> centigradeToFahreheit = x -> Double.valueOf((x*9/5)+32);
        System.out.println(centigradeToFahreheit.apply(40));
        Function<String, Integer> stringToInt = Integer::valueOf;
        System.out.println(stringToInt.apply("10"));
    }
}
