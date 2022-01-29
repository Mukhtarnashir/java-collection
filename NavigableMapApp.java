package collection;

import java.util.NavigableMap;
import java.util.TreeMap;

import collection.data.Collections;

public class NavigableMapApp {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Nashir", "Nashir");
        map.put("Mukhtar", "Mukhtar");
        map.put("Kempek", "Kempek");

        for (var key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.lowerKey("Nashir"));
        System.out.println(map.higherKey("Nashir"));

        NavigableMap<String, String> mapDesc = map.descendingMap();
        for (var key : mapDesc.keySet()) {
            System.out.println(key);
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> inmutable = Collections.emptyNavigableMap(mapDesc);

        System.out.println(empty);
        System.out.println(inmutable);
    }

}
