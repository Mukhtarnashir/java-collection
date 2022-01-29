package collection;

import java.util.ArrayList;
import java.util.List;

import collection.data.Collections;

public class CollectionsApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(List.of("Pondok", "Pesantren", "Khas", "Kempek"));

        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
 
        Collections.shuffle(list);
        System.out.println(list);
    }

}
