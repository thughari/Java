package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterStream {
    public static void main(String[] args) {
        //ex 1
        List<String> list = Arrays.asList("Hari", "Hello", "Thug", "Java", "Python", "SDE");
        list.stream().filter(s -> s.contains("H")).forEach(System.out::println);

        //ex 2
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenIntegers = numbers.stream().filter(n -> n%2==0).toList();
        System.out.print(evenIntegers.toString());
    }
}
