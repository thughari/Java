package java8.functionalInterface;

import java8.model.Person;

import java.util.function.Supplier;

public class SupplierFI {
    public static void main(String[] args) {
        Supplier<Person> supplier = () -> new Person("Hari", 23);
        Person person = supplier.get();
        System.out.println(person.getName() + " " + person.getAge());
    }
}
