package java8.streams;

import java.util.Arrays;
import java.util.List;

public class ReduceStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hari", "zebra", "Hello", "Thug", "Java", "Python", "SDE");
        String result = list.stream().reduce("", (a,b) -> a + " " +  b);
        System.out.println(result);

    }
}
