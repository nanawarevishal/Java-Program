package collection.list.arrayList;

import java.util.ArrayList;

class CricketPlayer{

    String name = null;
    int jerNo = 0;

    CricketPlayer(String name,int jerNo){
        this.name = name;
        this.jerNo = jerNo;
    }

    // first Option

    public String toString(){
        // return name;
        return jerNo+" : "+name;
    }

    // Second Method

    static void disp(Object obj){
        System.out.println(obj);
    }

}


class Client{

    public static void main(String[] args) {
        
        ArrayList ls = new ArrayList();

        ls.add(new CricketPlayer("Virat", 18));
        ls.add(new CricketPlayer("AB Develiers", 17));
        ls.add(new CricketPlayer("MSD", 07));


        for(Object obj : ls){
            CricketPlayer.disp(obj);
        }

        // System.out.println(ls);
    }
}

