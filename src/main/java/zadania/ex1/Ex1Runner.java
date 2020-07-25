package zadania.ex1;

import java.util.*;

public class Ex1Runner {
    public static void main(String[] args) {
        /// "Asia", "Kasia", "Zenek", "Paweł", "Piotrek"
        List<String> stringList = Ex1Runner.sortDescend("Asia", "Kasia", "Zenek", "Paweł", "Piotrek");
        stringList.forEach(x -> System.out.println(x));
    }

    public static List<String> sortDescend(String ... names){
        List<String> list = new ArrayList<String>();
        for(String str : names){
            list.add(str);
        }
        Collections.sort(list, Comparator.reverseOrder());
        return list;
    }
}
