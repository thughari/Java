package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hari", "Hello", "Thug", "Java", "Python", "SDE");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
    }
}
