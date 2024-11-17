package java8.functionalInterface;

import java8.model.Person;

import java.util.function.BiFunction;

public class BiFunctionFI {
    public static void main(String[] args) {
        BiFunction<Person, Person, String> biFunction= (p1,p2) ->
                p1.getName()+ " and " + p2.getName() + " had combined age of " + (p1.getAge() + p2.getAge()) + " years";
        System.out.println(biFunction.apply(new Person("Hari", 23), new Person("PK", 24)));

    }
}
