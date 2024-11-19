package java8.streams;

import java.util.Arrays;
import java.util.List;

public class MapSteam {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hari", "Hello", "Thug", "Java", "Python", "SDE");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        list.stream().map(String::toLowerCase).forEach(System.out::println);

        //eg 2
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbers.stream().map(n -> n*n).forEach(System.out::println);
        System.out.println(numbers);

    }
}
