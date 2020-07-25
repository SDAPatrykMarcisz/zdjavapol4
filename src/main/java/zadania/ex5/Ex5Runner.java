package zadania.ex5;

import java.util.HashSet;
import java.util.Set;

public class Ex5Runner {
    public static void main(String[] args) {
        Set<String> stringSet = new SDAHashSet<>();
        HashSet<String> hashSet = new SDAHashSet<>();
        stringSet.add("SDA");
        stringSet.forEach(x -> System.out.println(x));
    }
}
