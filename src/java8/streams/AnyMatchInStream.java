package java8.streams;

import java.util.Arrays;
import java.util.List;

public class AnyMatchInStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hari", "zebra", "Hello", "Thug", "Java", "Python", "SDE");
        boolean result = list.stream().anyMatch(a -> a.startsWith("H"));
        System.out.println(result);
    }
}
