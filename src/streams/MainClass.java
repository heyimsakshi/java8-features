package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 23, 26, 2, 8, 4, 10, 100, 999);

//        //Getting A Stream:
//        Stream<Integer> stream = numbers.stream();


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

        //flatMap() + foEach():
        System.out.println("FlatMap Example:");
        names.stream().flatMap(name -> Stream.of(name.charAt(2))).forEach(System.out::println);

        //Extra Methods:

        //min():
        Integer min = numbers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("Minimum Number In List Is: " + min);

        //max():
        Integer max = numbers.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("Maximum Number In List Is: " + max);

        //count():
        long count = numbers.stream().count();
        System.out.println("There Are " + count + " Numbers In List");

        //distinct():
        List<Integer> integers = List.of(1,1,1,2,2,3);
        long distinctCount = integers.stream().distinct().count();
        System.out.println("There Are " + distinctCount + " Distinct Numbers In List");
    }
}
