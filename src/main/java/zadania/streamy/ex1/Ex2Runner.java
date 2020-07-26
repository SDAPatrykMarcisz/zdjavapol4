package zadania.streamy.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Ex2Runner {

    public static void main(String[] args) {
        Optional<String> abc = toUpperCase("abcd");
        if(abc.isPresent()){
            String s = abc.get();
        }

        Integer integer = abc.map(x -> x.length())
                .filter(i -> i % 2 == 0)
                .orElse(0);

        Integer integer2 = abc.map(x -> x.length())
                .filter(i -> i % 2 == 0)
                .orElseThrow(() -> new RuntimeException());

        //"first" "second" "third" "fourth" "fifth"
        Stream.of("first", "second", "third", "fourth", "fifth")
                .filter(el -> el.length() > 5)
                .map(str -> str.toUpperCase())
                .forEach(x -> System.out.println(x));

        System.out.println("----");

        List<String> stringList = Arrays.asList("first123", "second", "third", "fourth", "fifth");

        Optional<String> first = stringList.stream()
                .filter(x -> x.length() > 7)
                .findFirst();

        System.out.println(first);
        first.ifPresentOrElse(
                x -> System.out.println(x),
                () -> System.out.println("pusto")
        );


    }

    private static Optional<String> toUpperCase(String str){
        if(str != null){
            return Optional.of(str.toUpperCase());
        }
        return Optional.ofNullable(null);
    }
}
