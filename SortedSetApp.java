package collection;

import java.util.SortedSet;
import java.util.TreeSet;

import collection.data.Collections;
import collection.data.Person;
import collection.data.PersonComperator;

public class SortedSetApp {
    public static void main(String[] args) {

        SortedSet<Person> poeple = new TreeSet<>(new PersonComperator());

        poeple.add(new Person("Mukhtar"));
        poeple.add(new Person("Nashir"));
        poeple.add(new Person("Kempek"));

        for (var person : poeple) {
            System.out.println(person.getName());
        }

       SortedSet <Person> sortedSet = Collections.unmodifiableSortedSet(poeple);
       System.out.println(sortedSet);

    }
}
