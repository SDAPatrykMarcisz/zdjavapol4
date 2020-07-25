package zadania.ex3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex3Runner {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("ala", "kot");
        map.put("pies", "donek");

        for (Map.Entry<String, String> entry : map.entrySet()){

        }

        for(Iterator<Map.Entry<String, String>> it = map.entrySet().iterator(); it.hasNext();){
            Map.Entry<String, String> next = it.next();
            System.out.print(String.format("klucz: %s, wartosc: %s", next.getKey(), next.getValue()));
            if(it.hasNext()){
                System.out.println(",");
            } else {
                System.out.println(".");
            }
        }
    }

}
