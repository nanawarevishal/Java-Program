package collection.Set.HashSet.LinkedHashSet;

import java.util.LinkedHashSet;

class CrickPlayer{

    int jerNo = 0;
    String name = null;

    CrickPlayer(int jerNo,String name){
        this.jerNo = jerNo;
        this.name = name;
    }

    // public String toString(){
    //     return name +"-"+jerNo;
    // }
}


class Client{

    public static void main(String[] args) {
        
        LinkedHashSet lhs = new LinkedHashSet<>();

        lhs.add(new CrickPlayer(18, "Virat")); // here data not duplicated beacause it will create the new 
        lhs.add(new CrickPlayer(07, "MSD"));
        lhs.add(new CrickPlayer(07, "MSD"));
        lhs.add(new CrickPlayer(45, "Rohit"));
        lhs.add(new CrickPlayer(18, "Virat"));
        
        System.out.println(lhs);
    }
}
