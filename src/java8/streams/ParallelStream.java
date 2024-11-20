package java8.streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hari", "zebra", "Hello", "Thug", "Java", "Python", "SDE");
        list.parallelStream().forEach(name -> System.out.println(name+ " - "+ Thread.currentThread().getName()));
    }
}
