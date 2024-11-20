package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByInStreamWithCollector {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hari", "zebra", "Hello", "Thug", "Java", "Python", "SDE");
        Map<Character, List<String>> result = list.stream().collect(Collectors.groupingBy(a -> a.charAt(0)));
        System.out.println(result);
    }
}
