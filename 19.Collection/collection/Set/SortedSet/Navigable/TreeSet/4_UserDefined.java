package collection.Set.SortedSet.Navigable.TreeSet;

import java.util.TreeSet;

class Movies implements Comparable{

    String movieName = null;
    float totColl = 0.0f;

    Movies(String movieName,float totColl){
        this.movieName = movieName;
        this.totColl = totColl;
    }

    public String toString(){
        return movieName +"-"+totColl;
    }

    public int compareTo(Object obj){
        return movieName.compareTo(((Movies)obj).movieName); // For Ascending Order Sorting the data
        // return -(movieName.compareTo(((Movies)obj).movieName)); // For Descending Order Sorting the data
    }
}


class Client4{

    public static void main(String[] args) {
        
        TreeSet ts = new TreeSet<>();

        ts.add(new Movies("Gadar", 150.23f));
        ts.add(new Movies("OMG-2", 250.00f));
        ts.add(new Movies("Jailer", 350.67f));
        ts.add(new Movies("Iron-Man", 3450.67f));


        System.out.println(ts);
    }
}