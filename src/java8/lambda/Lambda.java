package java8.lambda;

public class Lambda {
    public static void main(String[] args) throws InterruptedException {
        Runnable hello = () -> System.out.println("Hello");
        hello.run();
    }
}
