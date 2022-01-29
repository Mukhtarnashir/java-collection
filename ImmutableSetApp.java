package collection;

import java.util.HashSet;
import java.util.Set;

import collection.data.Collections;

public class ImmutableSetApp {
    public static void main(String[] args, Object mutable) {
        
        Set<String> empty = Collections.emptyset();
        Set<String> one = java.util.Collections.singleton("Nashir"); 

        System.out.println(empty);
        System.out.println(one);

        Set <String> immutable = new HashSet<>();
        immutable.add("pondok");
        immutable.add("khas");

        Set <String> inmutable = Collections.unmodifiableSet(mutable);
        System.out.println(inmutable);
        
        Set <String> set = Set.of("pondok", "khas");
        System.out.println(set);



        


    }
    
}
