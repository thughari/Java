package java8.streams;

import java.util.Arrays;
import java.util.List;

public class SortInStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hari", "zebra", "Hello","pawan", "Thug", "Java", "Python", "SDE");
        list.stream().sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::println);

        // numbers
        List<Integer> numbers = Arrays.asList(5,6,4,7,9,8,3,1,2,10);
        numbers.stream().sorted((o1, o2) -> o2-o1).forEach(System.out::println);

    }
}
