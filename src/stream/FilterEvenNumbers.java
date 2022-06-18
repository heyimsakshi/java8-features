package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0 ; i <= 10 ; i++){
            numbers.add(i);
        }

        List<Integer> results = numbers.stream().filter(element -> element % 2 == 0).collect(Collectors.toList());
        results.forEach(System.out::println);
    }
}
