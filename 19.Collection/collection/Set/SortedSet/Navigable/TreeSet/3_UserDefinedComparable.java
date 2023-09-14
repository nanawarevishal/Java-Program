package collection.Set.SortedSet.Navigable.TreeSet;

import java.util.TreeSet;

class Myclass implements Comparable{

    String str = null;

    Myclass(String str){
        this.str = str;
    }

    public String toString(){
        return str;
    }

    public int compareTo(Object obj){
        return str.compareTo(((Myclass)obj).str);
    }
}


class Client3{
    
    public static void main(String[] args) {
        
        TreeSet ts = new TreeSet<>();

        ts.add(new Myclass("Kanha"));
        ts.add(new Myclass("Ashish"));
        ts.add(new Myclass("Rahul"));
        ts.add(new Myclass("Badhe"));
    }
}