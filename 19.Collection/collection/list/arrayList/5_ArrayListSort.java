package collection.list.arrayList;


import java.util.*;
class SortDemo{

    public static void main(String[] args) {
        
        ArrayList ls = new ArrayList();

        ls.add("Kanha");
        ls.add("Badhe");
        ls.add("Ashish");
        ls.add("Rahul");

        System.out.println(ls);
        Collections.sort(ls);

        System.out.println(ls);

        TreeSet ts = new TreeSet<>(ls);

        System.out.println(ts);

    }
}
