package zadania.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Ex2Runner {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("Asia", "asia", "Kasia", "Zenek", "Paweł", "Piotrek");
        input.forEach(System.out::println);
        input.forEach(x -> System.out.println(x));


    }

    public static List<String> sortIgnoreLetterCase(List<String> input){
        Collections.sort(input, String.CASE_INSENSITIVE_ORDER);
        return input;
    }
}
