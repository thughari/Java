package java8.functionalInterface;

import java8.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFI {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Hari", 23));
        personList.add(new Person("Phani", 24));
        personList.add(new Person("Nikhil",25));
        personList.add(new Person("Siva", 26));
        Consumer<Person> personConsumer = person ->
                System.out.println(person.getName() + " " + person.getAge());
        for (Person p: personList){
            personConsumer.accept(p);
        }
//        personConsumer.accept(personList.get(2));
    }
}
