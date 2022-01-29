package collection;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

    List<String> strings = new ArrayList<>(10);

        strings.add("Mukhtar");
        strings.add("Nashir");

        strings.set(1, "Rohman");

    

        //strings.remove();
       // System.out.println(strings.get(0));

        for (var value : strings) {
            System.out.println(value);
        }

    }

}
