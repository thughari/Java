package java8.functionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateFI {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = new BiPredicate<String, Integer>() {
            @Override
            public boolean test(String s, Integer n) {
                return Integer.parseInt(s)>n;
            }
        };

        System.out.println(biPredicate.test("18", 18));
    }
}
