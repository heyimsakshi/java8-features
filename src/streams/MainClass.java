package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 23, 26, 2, 8, 4, 10, 100, 999);


        //filter(Predicate) + collect():

        System.out.println("Result:");
        List<Integer> result = numbers.stream().filter(element -> element % 2 == 0).collect(Collectors.toList());
        result.forEach(System.out::println);
        
        //Sorted() + collect():

        System.out.println("Sorted Result:");
        List<Integer> sortedResult = numbers.stream().sorted().collect(Collectors.toList());
        sortedResult.forEach(System.out::println);

        //filter(Predicate) + sorted() + forEach():

        System.out.println("Numbers Less Than 20");
        numbers.stream().filter(element -> element < 20).sorted().forEach(System.out::println);

        //map() + collect():
        List<String> names = List.of("Anjaniy", "Jay", "Mahesh", "Vrushabh");
        System.out.println("Converting Names Into LowerCase:");
        List<String> lowerCaseNames = names.stream().map(name -> name.toLowerCase()).collect(Collectors.toList());
        lowerCaseNames.forEach(System.out::println);

        //map() + sorted() + forEach():
        System.out.println("Converting Names Into UpperCase:");
        names.stream().map(name -> name.toUpperCase()).sorted().forEach(System.out::println);
    }
}
