package java8.parallelsorting;

import java.util.Arrays;
import java.util.List;

public class ParallelSorting {
    public static void main(String[] args) {
        int[] array = {6,5,4,7,8,2,9,3,1,10};
        Arrays.parallelSort(array);
        System.out.println(Arrays.toString(array));
    }
}
