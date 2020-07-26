package zadania.ex26;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex26Runner {
    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() {
        Set<Model> collect = manufacturerList().stream()
                .flatMap(manufacturer -> manufacturer.getModels().stream())
                .collect(Collectors.toSet());

        manufacturerList().stream()
                .flatMap(manufacturer -> manufacturer.getModels().stream())
                .forEach(x -> System.out.println(x));
    }

    private static List<Manufacturer> manufacturerList(){
        return Collections.emptyList();
    }
}
