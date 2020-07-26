package zadania.streamy.ex1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex5Runner {
    public static void main(String[] args) {
        List<String> collect = Stream.of(1, 26, 30, 2, 45)
                .filter(element -> element > 26)
                .map((Integer element) -> {
                    String result = String.valueOf(element);
                    return result;
                })
                .collect(Collectors.toList());

        for (String str : collect) {
            System.out.println(str);
        }

        main2(new String[]{});
    }

    public static void main2(String[] args) {
        Stream.of(1, 26, 39, 2, 45)
                .filter(wejsciowa -> wejsciowa > 26)
                .map(integer -> {
                    return integer = new Integer(integer);
                })
                .map(integer -> Integer.toString(integer))
                .forEach(str -> System.out.println(str));
    }
}

