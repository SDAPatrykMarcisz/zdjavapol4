package zadania.streamy.ex1;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex4Runner {
    public static void main(String[] args) {
        IntStream intStream = Stream.of(1, 26, 30, 2, 45)
                .mapToInt(x -> x);
        OptionalInt max = intStream.max();
        max.ifPresent(x -> System.out.println(x));

        Integer max2 = Stream.of(1, 26, 30, 2, 45)
                .reduce(
                        Integer.MIN_VALUE,
                        (acc, curr) -> {
                            int max1 = Math.max(acc, curr);
                            return max1;
                        }
                );

        System.out.println(max2);

    }
}
