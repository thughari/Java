package java8.optional;

import java.util.Arrays;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Hari");
        System.out.println(name.get());
        System.out.println(Optional.of("hari"));
        System.out.println(name.isPresent() + " " + name.isEmpty());

        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        String nullName = null;
        String string = Optional.ofNullable(nullName).orElse("Hari");
        System.out.println(string);;
    }
}
