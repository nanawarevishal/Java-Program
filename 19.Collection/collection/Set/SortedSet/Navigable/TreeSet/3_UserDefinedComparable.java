package collection.Set.SortedSet.Navigable.TreeSet;

import java.util.TreeSet;

class Myclass{

    String str = null;

    Myclass(String str){
        this.str = str;
    }

    public String toString(){
        return str;
    }

    public int compareTo(Myclass obj){
        return (obj.str).compareTo(this.str);
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