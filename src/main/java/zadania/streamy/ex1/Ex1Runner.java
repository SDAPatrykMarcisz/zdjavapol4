package zadania.streamy.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex1Runner {
    public static void main(String[] args) {
        //"first" "second" "third" "fourth" "fifth"
        Stream.of("first", "second", "third", "fourth", "fifth")
                .filter(el -> el.length() > 5)
                .map(str -> str.toUpperCase())
                .forEach(x -> System.out.println(x));

        System.out.println("----");

        List<String> stringList = Arrays.asList("first", "second", "third", "fourth", "fifth");
        stringList.stream()
                .filter(element -> element.length() > 5)
                .map(str -> str.toUpperCase())
                .forEach(x -> System.out.println(x));
    }
}
