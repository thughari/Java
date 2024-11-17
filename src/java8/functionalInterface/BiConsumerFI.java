package java8.functionalInterface;

import java8.model.Person;

import java.util.function.BiConsumer;

public class BiConsumerFI {
    public static void main(String[] args) {
        BiConsumer<Person, Person> biConsumer = (p1, p2) -> {
            System.out.println(p1.getName() + " " + p2.getName());
            System.out.println(p1.getAge() + " " + p2.getAge());
        };

        Person person1= new Person("Hari", 23);
        Person person2= new Person("Phani", 24);
        biConsumer.accept(person1, person2);
    }
}
