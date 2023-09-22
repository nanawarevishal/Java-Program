package Map.TreeMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

class PlatForm {

    String str = null;
    int year = 0;

    PlatForm(String str,int year){
        this.str = str;
        this.year = year;
    }

    public String toString(){
       return "{ PlatForm Name: "+str+", Foundation Year: "+year+ " Parent Comapany :"+  "}\n";
    }


    // public int compareTo(Object obj){
    //     return year - (((PlatForm)obj).year);
    // }
}


class sortByFoundedYear implements Comparator{

    public int compare(Object obj1,Object obj2){
        return (((PlatForm)obj1).year) - (((PlatForm)obj2).year);
    }
}


class sortByPlatFormName implements Comparator<PlatForm>{

    public int compare(PlatForm obj1 , PlatForm obj2){
        return obj1.str.compareTo(obj2.str);
    }
}

class sortByPlatform implements Comparator{

    public int compare(Object obj1,Object obj2){
        return ((PlatForm)obj1).str.compareTo(((PlatForm)obj2).str);
    }
}

class sortByYear implements Comparator{

    public int compare(Object obj1,Object obj2){
        return ((PlatForm)obj1).year - ((PlatForm)obj2).year;
    }

}

class Client{

     public static void main(String[] args) {
        
        // TreeMap tm = new TreeMap<>(new sortByPlatFormName());
        // TreeMap tm = new TreeMap<>(new sortByFoundedYear());
        // TreeMap tm = new TreeMap<>(new sortByPlatform());
        TreeMap tm = new TreeMap<>(new sortByYear());

        tm.put(new PlatForm("YouTube", 2005), "Google");
        tm.put(new PlatForm("Instagram", 2013), "Meta");
        tm.put(new PlatForm("FaceBook", 2004), "Meta");
        tm.put(new PlatForm("ChatGPT", 2022), "OpenAI");

        System.out.println(tm);

        // Collections.sort(tm, new sortByPlatFormName());

    }
}
   