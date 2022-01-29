package collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTabaleApp {
    public static void main(String[] args) {

        Map<String, String> map = new Hashtable<>();
        map.put("Pondok", "Pondok");
        map.put("Khas", "Khas");

        for (var key : map.keySet()) {
            System.out.println(key);
        }

    }

}
