package zadania.ex4;

import java.util.*;

public class Storage {
    private Map<String, List<String>> internalStorage;

    public Storage() {
        this.internalStorage = new HashMap<>();
    }

    public void addToStorage(String key, String value){
        if(internalStorage.containsKey(key)){
            List<String> listOfValues = internalStorage.get(key);
            listOfValues.add(value);
        } else {
            List<String> listOfValues = new ArrayList<>();
            listOfValues.add(value);
            internalStorage.put(key, listOfValues);
        }
    }

    public void printValues(String key){
        if(internalStorage.containsKey(key)){
            List<String> values = internalStorage.get(key);
            System.out.println(values);
        }
    }

    public void findValues(String value){
        Set<String> keySet = new TreeSet<>();
        for (Map.Entry<String, List<String>> entry : internalStorage.entrySet()) {
            for(String el : entry.getValue()){
                if(el.equals(value)){
                    keySet.add(el);
                }
            }
        }

        for(String key : keySet){
            System.out.println(key);
        }
    }
}
