package Map.TreeMap;

import java.util.Set;
import java.util.TreeMap;

class TreeMapDemo{

    public static void main(String[] args) {
        
        TreeMap tm = new TreeMap<>();

        tm.put("Ind", "India");
        tm.put("Pak", "Pakistan");
        tm.put("SL", "SriLanka");
        tm.put("Aus", "Australia");
        tm.put("Ban", "Bangladesh");

        System.out.println(tm);

    }
}