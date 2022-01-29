package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();
        collection.add("Mukhtar");
        collection.add("Nashir");
        collection.add("Al-brebesi");
        collection.addAll(List.of("Prapag", "Lor", "Losari"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println("REMOVE");

        collection.remove("Al-brebesi");
        collection.removeAll(List.of("Prapag", "Lor"));


        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println(
                collection.contains("Mukhtar"));

        System.out.println(
                collection.containsAll(List.of("Prapag", "Lor")));

        System.out.println(collection.size());

    }

}
