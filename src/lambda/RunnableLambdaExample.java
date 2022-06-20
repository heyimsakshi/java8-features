package lambda;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadDemo());
        thread.start();

        //Using lambda expression:

        Runnable runnable = () -> {
            System.out.println("Thread Is Running Using Lambda Expression.");
        };

        runnable.run();
    }
}
