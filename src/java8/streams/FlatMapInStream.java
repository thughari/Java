package java8.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatMapInStream {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Hari", "Thatikonda");
        List<String> list2 = Arrays.asList("Hello", "World");
        List<List<String>> nestedList = Arrays.asList(list1, list2);
        nestedList.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
