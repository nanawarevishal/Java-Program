package Map.WeakHashMap;

import java.util.HashMap;
import java.util.WeakHashMap;

class weakhashMap2{

    String str;

    weakhashMap2(String str){
        this.str = str;
    }

    public String toString(){

        return str;
    }

    public void finalize(){

        System.out.println("Notify");
    }

    public static void main(String[] args) {
        
        weakhashMap2 obj1 = new weakhashMap2("Core2Web");
        weakhashMap2 obj2 = new weakhashMap2("Biencaps");
        weakhashMap2 obj3 = new weakhashMap2("Incubator");

        WeakHashMap hm = new WeakHashMap<>();

        hm.put(obj1,2016);
        hm.put(obj2,2019);
        hm.put(obj3,2023);

        System.out.println(hm);

        // System.out.println(obj1);
        // System.out.println(obj2);
        
        obj1 = null;
        obj2 = null;
        
        System.gc();

        System.out.println(hm);
    }
}