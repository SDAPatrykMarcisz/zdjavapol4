package zadania.ex6;

import java.util.Map;
import java.util.TreeMap;

public class Ex6Runner {

    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("klucz", "wartosc");
        map.put("klucz2", "wartosc2");
        firstAndLast(map);

        Map<String, Integer> intMap = new TreeMap<>();
        intMap.put("klucz", 4);
        intMap.put("klucz2", 5);
        firstAndLast(intMap);
    }

    private static void firstAndLast(Map<?, ?> map){
        if(map instanceof TreeMap){
            TreeMap<?, ?> treeMap = (TreeMap<?,?>)map;
            System.out.println(treeMap.lastEntry());
            System.out.println(treeMap.firstEntry());
        }
    }
}
