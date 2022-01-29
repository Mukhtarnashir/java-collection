package collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LingkedHashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<>();

        map.put("frist", "PONDOK");
        map.put("middle", "KHAS");
        map.put("last", "KEMPEK");

        Set<String> keys = map.keySet();

        for (var key : keys) {
            System.out.println(key);
        }
    }

}
