package collection;

import java.util.List;

public class IterebleApp {
    public static void main(String[] args) {

        Iterable<String> names = List.of("Mukhtar ", "Nashir ", "Al- brebesi");
        for (var name : names) {
            System.out.println(name);
        }

    }
}