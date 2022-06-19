package functionalinterfaces;

public class GreetClass implements Greet{
    @Override
    public void greet(String message) {
        System.out.println("Hi There, " + message + ".");
    }

    //Giving own implementation:
    @Override
    public void add(int n1, int n2) {
        System.out.println("Sum of n1 & n2 = " + (n1 + n2));
    }
}
