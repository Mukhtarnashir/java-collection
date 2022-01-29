package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {
        
        Map<String, String> map = new HashMap<>();
        map.put("name.first", "PONDOK");
        map.put("name.middle", "KHAS");
        map.put("name.last", "KEMPEK");   

        
        System.out.println(map.get("name.frist"));
        System.out.println(map.get("name.middle"));
        System.out.println(map.get("name.last"));
    }
    
}
