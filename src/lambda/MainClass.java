package lambda;

import functionalinterfaces.mymath.MyMath;

public class MainClass {
    public static void main(String[] args) {
        MyMath addition = (int n1, int n2) -> {
            System.out.println("Addition of n1 & n2 = " + (n1 + n2));
        };

        addition.add(10, 20);
        System.out.println("Value of PI = " + MyMath.getPI());
        addition.introduction();
    }
}
