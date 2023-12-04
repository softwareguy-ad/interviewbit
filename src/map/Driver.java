package map;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
        HashMap<String, Integer>  map = new HashMap<>();
        map.put("akshay", 10);
        map.put("Disha", 9);
        map.put("Swadin", 2);
        map.entrySet().stream().forEach(k-> System.out.println(k.getKey() +"\t"+ k.getValue()));
        System.out.println("After Sorting");

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        Collections.sort(entryList, new Comparator<Map.Entry<String,Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> entry : entryList){
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println("------- After sorting in map"   );
        linkedHashMap.entrySet().stream().forEach(i-> System.out.println(i.getKey() + "\t" + i.getValue()));


    }
}
