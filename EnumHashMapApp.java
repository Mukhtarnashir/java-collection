package collection;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMapApp {
    public static enum level {
        FREE, STANDARD, PREMIUM, VIP

    }

    public static void main(String[] args) {

        Map<level, String> map = new EnumMap<>(level.class);
        map.put(level.FREE, "Mukhtar");
        map.put(level.VIP, "Nashir");

        for (var key : map.keySet()) {
            System.out.println(map.get(key));
        }

    }

}
