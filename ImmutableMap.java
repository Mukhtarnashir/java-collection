package collection;

import java.util.HashMap;
import java.util.Map;

import collection.data.Collections;

public class ImmutableMap {
    public static void main(String[] args) {

        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name", "Nashir");

        System.out.println(empty);
        System.out.println(singleton);

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Nashir");
        Map<String, String> inmutable = Collections.unmodiafiableMap(mutable);
        System.out.println(inmutable);

        Map<String, String> map = Map.of(
                "frist", "PONDOK",
                "middle", "KHAS",
                "last", "KEMPEK"

        );

        System.out.println(map);

    }

}
