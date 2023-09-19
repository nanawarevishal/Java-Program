package collection.Set.NavigableSet;

import java.util.NavigableSet;
import java.util.TreeSet;

class NavigableSetDemo{

    public static void main(String[] args) {
        
        NavigableSet ns = new TreeSet<>();

        ns.add(10);
        ns.add(30);
        ns.add(14);
        ns.add(27);
        ns.add(23);

        System.out.println(ns);

        // lower()

        System.out.println(ns.lower(23));
    }
}
