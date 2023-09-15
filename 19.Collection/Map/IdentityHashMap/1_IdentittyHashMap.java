package Map.IdentityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;

class IdentityHashMapDemo{

    public static void main(String[] args) {
        IdentityHashMap hm = new IdentityHashMap<>();    // In hashmap data will be compared here so the duplicate key checked based on the data

        hm.put(new Integer(10), "Kanha");
        hm.put(new Integer(10), "Rahul");
        hm.put(new Integer(10), "Badhe");

        hm.put(10, "Kanha");
        hm.put(10, "Kanha");
        hm.put(10, "Kanha");

        hm.put(210, "Badhe");
        hm.put(210, "Badhe");
        hm.put(210, "Badhe");

        System.out.println(hm);
    }
}