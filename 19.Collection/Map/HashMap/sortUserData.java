package Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class PlatForm implements Comparable {

    String str = null;
    int year = 0;

    PlatForm(String str,int year){
        this.str = str;
        this.year = year;
    }

    public String toString(){
       return "{ PlatForm Name: "+str+", Foundation Year: "+year+ " Parent Comapany :"+  "}\n";
    }


    public int compareTo(Object obj){
        return year - (((PlatForm)obj).year);
    }
}


class Client{

    public static void main(String[] args) {
        
        Map tm = new HashMap<>();

        tm.put(new PlatForm("YouTube", 2005), "Google");
        tm.put(new PlatForm("Instagram", 2013), "Meta");
        tm.put(new PlatForm("FaceBook", 2004), "Meta");
        tm.put(new PlatForm("ChatGPT", 2022), "OpenAI");

        TreeMap mtm = new TreeMap<>(tm);

        System.out.println(mtm);
    }  
}

