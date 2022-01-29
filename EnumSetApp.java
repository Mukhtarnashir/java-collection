package collection;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetApp {

    public static enum Gender {

        PONDOK, KHAS, KEMPEK

    }

    public static void main(String[] args) {

        //Set<Gender> genders = EnumSet.allOf(Gender.class);
        Set<Gender> genders = EnumSet.of(Gender.KEMPEK);

        for (var gender : genders) {
            System.out.println(gender);
        }
    }

}
