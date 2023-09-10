package collection.list.arrayList;

import java.util.List;
import java.util.ArrayList;

class arrayList{

    public static void main(String[] args) {
        
        List ls = new ArrayList();

        ls.add("Core2Web");
        ls.add(10);
        ls.add(23.1f);
        ls.add('s');
        ls.add(true);

        System.out.println(ls);

        ls.add(3,"Incubator");
        System.out.println(ls);

        System.out.println("Size: "+ls.size());

        System.out.println("Last index of: "+ls.lastIndexOf(false));
        System.out.println("Last index of: "+ls.lastIndexOf(true));

        System.out.println(ls.get(3));

        Object[] str = ls.toArray();

        // System.out.println(str);
        

    }
}