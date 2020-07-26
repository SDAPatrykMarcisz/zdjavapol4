package zadania.ex26;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalInterface {
    public static void main(String[] args) {
        Predicate<String> stringPredicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 10;
            }
        };

        stringPredicate.test("abcde");

        Predicate<String> stringPredicate2 = x -> x.length() > 10;

        Predicate<String> stringPredicate3 = (String s) -> {
                return s.length() > 10;
            };

        List<String> stringList = Stream.of("abc", "cde", "fgh", "hij")
                .filter(x -> x.contains("c"))
                .collect(Collectors.toList());

        System.out.println(stringList);
    }
}
