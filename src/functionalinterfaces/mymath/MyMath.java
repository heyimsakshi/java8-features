package functionalinterfaces.mymath;

@FunctionalInterface
public interface MyMath {
    void add(int n1, int n2);
    static double getPI(){
        return 3.141592653589793;
    }
    default void introduction(){
        System.out.println("Welcome To My Math Interface");
    }
}
