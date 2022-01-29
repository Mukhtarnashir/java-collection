package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {

        List<String> one = Collections.singletonList("Satu");
        List<String> empty = Collections.emptyList();

        System.out.println(one);
        System.out.println(empty);

        List<String> mutable = new ArrayList<>();
        mutable.add("Mukhtar");
        mutable.add("Nashir");

        List<String> immutable = Collections.unmodifiableList(mutable);
        System.out.println(immutable);

        List<String> element = List.of("Mukhtar", "Nashir");
        System.out.println(element);

    }

}
