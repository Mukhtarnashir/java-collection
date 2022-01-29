package collection;


import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {

        //Set<String> names = new HashSet<>();
        Set <String> names = new LinkedHashSet<>();

        names.add("Pondok");
        names.add("KHAS");
        names.add("Kempek");
        names.add("Pondok");
        names.add("KHAS");
        names.add("Kempek");

        for (var name : names) {
            System.out.println(name);
        }
    }

}
