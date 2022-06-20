package optional;

import java.util.Optional;

public class OptionalClassDemo {
    public static void main(String[] args) {

        //With Data Types:
        String name = null;
        String message = "Good Morning";


        Optional<String> optionalSting = Optional.ofNullable(name);

//        if(optionalSting.isPresent()){
//            System.out.println("String Object Is Present : " + optionalSting.get());
//        }else{
//            System.out.println("String Object Is Null");
//        }

        System.out.println(optionalSting.orElse("String Object Is Null"));

        //With Classes & Objects:
        Student jay = new Student(12121, "Jay Shah", "CSE");
        Student anjaniy = null;
        Optional<Student> optionalStudent = Optional.ofNullable(jay);

//        if(optional.isPresent()){
//            System.out.println("Student Object Is Present : " + optional.get());
//        }else{
//            System.out.println("Student Object Is Null.");
//        }

        System.out.println(optionalStudent.orElseThrow(() -> new RuntimeException("Student Object Is Null")));

        /* Other Methods: */

        //empty():
        Optional<Integer> id = Optional.empty();
        System.out.println("Optional: " + id);
        System.out.println("Has value: " + id.isPresent());

        //of():
        Integer enrollment = 121212;
        Optional<Integer> optionalInteger = Optional.of(enrollment);
        System.out.println(optionalInteger.isPresent());
//        System.out.println(optionalInteger.get());
        System.out.println(optionalInteger.orElse(111111));

    }
}
