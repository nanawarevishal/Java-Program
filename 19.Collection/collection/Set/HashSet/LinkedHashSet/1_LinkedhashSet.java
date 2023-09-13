package collection.Set.HashSet.LinkedHashSet;

import java.util.LinkedHashSet;

class LinkedhsSet{

    
    public static void main(String[] args) {
        
        LinkedHashSet lhs = new LinkedHashSet<>();

        // lhs.add("Kanha");
        // lhs.add("Rahul");
        // lhs.add("Ashish");
        // lhs.add("Badhe");
        // lhs.add("Rahul");
        // lhs.add("Ashish");

        lhs.add(new String("Kanha"));
        lhs.add(new String("Rahul"));
        lhs.add(new String("Ashish"));
        lhs.add(new String("Badhe"));
        lhs.add(new String("Rahul"));
        lhs.add(new String("Ashish"));

        System.out.println(lhs);
    }
}