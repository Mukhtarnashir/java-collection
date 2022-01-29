package collection;


import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {

        SortedMap<String, String> sortedMap = new TreeMap<>();

        sortedMap.put("Pondok", "Pondok");
        sortedMap.put("Khas", "Khas");
        sortedMap.put("Kpempek", "kempek");

        for (var key : sortedMap.keySet()) {
            System.out.println(key);

        }

    }

}
