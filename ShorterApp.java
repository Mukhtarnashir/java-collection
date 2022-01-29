package collection;

import java.util.ArrayList;
import java.util.List;

import collection.data.Collections;

public class ShorterApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.addAll(List.of("Pondok", "Pesantren", "Khas", "Kempek", "Cirebon"));

        Collections.sort(list);
    }



}
