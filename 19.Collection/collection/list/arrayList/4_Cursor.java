package collection.list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

class IteratorDemo{

    public static void main(String[] args) {
        
        ArrayList ls = new ArrayList<>();

        ls.add("Kanha");
        ls.add("Rahul");
        ls.add("Ashish");

        Iterator itr = ls.iterator();

        while(itr.hasNext()){

            if("Rahul".equals(itr.next())){
                itr.remove();
            }

            System.out.println(itr.next());
        }
    }
}