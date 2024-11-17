package java8.model;

public class Adder {
    public static int add(int a, int b) {
         return a+b;
    }

    public static float add(int a, float b) {
        return a+b;
    }

    public static float add(float a, int b) {
        return a+b;
    }

    public int nonStaticAdd(int a, int b) {
        return a+b;
    }
}
