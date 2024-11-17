package java8.functionalInterface;

import java8.model.Person;

import java.util.function.Predicate;

public class PredicateFI {
    public static void main(String[] args) {
        Predicate<Person> predicate = (person) -> person.getAge() > 18;
        System.out.println(predicate.test(new Person("hari",21)));
        System.out.println(predicate.test(new Person("hari",17)));
    }
}
