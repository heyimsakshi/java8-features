package functionalinterfaces.greet;

@FunctionalInterface
public interface Greet {
    //Can have only one single abstract method:
    void greet(String message);

    //Having default & static methods:

    default void add(int n1, int n2){
        System.out.println("Addition of n1 & n2 = " + (n1 + n2));
    }

    static double getPI(){
        return 3.141592653589793;
    }

    //Overriding the public methods of java.lang.Object class:
    @Override
    String toString();
}
