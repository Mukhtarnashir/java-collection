package collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Mukhtar", "Nashir", "Bin", "Rohman"));

        NavigableSet<String> namesReverse = names.descendingSet();
        SortedSet<String> Nashir = names.tailSet("Nashir", true);

        System.out.println(namesReverse);

        for (var name : Nashir) {
            System.out.println(name);
        }

        NavigableSet<String> inmutable = Collections.unmodifiableNavigableSet(names);
        inmutable.add("Why");
    }

}
