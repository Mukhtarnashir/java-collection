package collection;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new IdentityHashMap<>();

        String key1 = "name. frist";

        String name = "name";
        String dot = "dot";
        String frist = "frist";

        String key2 = name + dot + frist;

        System.out.println(key1.equals(key2));
        System.out.println(key1 == key2);

        map.put(key1, "Nashir");
        map.put(key2, "Nashir");
        System.out.println(map.size());
    }

}
