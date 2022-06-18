package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ToLowerCaseStrings {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anjaniy Salekar");
        names.add("Jay Shah");
        names.add("Vrushabh Mistry");
        names.add("Mahesh Baria");

        List<String> results = names.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
        results.forEach(System.out::println);
    }
}
