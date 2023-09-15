package Map.HashMap;

import java.util.HashMap;

class CountryPM{
    public static void main(String[] args) {
        
        HashMap hm = new HashMap<>();

        hm.put("Java", ".java");
        hm.put("Pyhton", ".py");
        hm.put("Dart",".dart");

        System.out.println(hm);

        System.out.println(hm.get("Dart"));
        System.out.println(hm.get("CPP"));

        // KeySet
        System.out.println(hm.keySet());

        // Value
        System.out.println(hm.values());

        //entrySet
        System.out.println(hm.entrySet());

        


    }
}