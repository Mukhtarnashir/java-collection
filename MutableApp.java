package collection;

import java.util.List;

import collection.data.Person;

public class MutableApp {
    public static void main(String[] args) {

        Person person = new Person("Nashir");

        person.addHobby("Game");
        person.addHobby("Tidur");

        doSomethingWithHobbies(person.getHobbies());

        for (var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }

    }

    public static void doSomethingWithHobbies(List<String> list) {
        list.add("Bukan Hobby");

    }

}
