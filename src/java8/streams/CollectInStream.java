package java8.streams;

import java.util.Arrays;
import java.util.List;

public class CollectInStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hari", "Hello", "Thug", "Java", "Python", "SDE");
        List<String> startsWithH = list.stream().filter(a->a.startsWith("H")).toList();
        System.out.println(startsWithH);
    }
}
