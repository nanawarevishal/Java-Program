package collection.list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movies{

    String movieName = null;
    float IMDBRating = 0.0f;
    double totColl = 0.0;

    Movies(String movieName,float IMDBRating, double totColl){
        this.movieName = movieName;
        this.IMDBRating = IMDBRating;
        this.totColl = totColl;

    }

    public String toString(){

        return "{ Movie Name: "+movieName+", IMDB Ratings: "+IMDBRating+", Total Collection: "+totColl+" }\n";
    }


}


class SortByMovieName implements Comparator{

    public int compare(Object obj1,Object obj2){
        return ((Movies)obj1).movieName.compareTo(((Movies)obj2).movieName);
    }
}

class SortByMovieCollection implements Comparator{

    public int compare(Object obj1,Object obj2){
        return -(int)(((Movies)obj1).totColl - ((Movies)obj2).totColl);
    }
}

// class SortByIMDBRating implements Comparator{

//     public int compare(Object obj1,Object obj2){
//         return (int)(((Movies)obj1).IMDBRating - ((Movies)obj2).IMDBRating);
//     }
// }

class SortByIMDBRating implements Comparator<Movies>{

    public int compare(Movies obj1,Movies obj2){
        return (int)(((obj1).IMDBRating) - ((obj2).IMDBRating));
    }
}

class Client7{

    public static void main(String[] args) {
        
        ArrayList<Movies> ls = new ArrayList<>();

        ls.add(new Movies("Iron Man", 10.00f, 25000.00));
        ls.add(new Movies("Avengers Infinity War", 9.8f, 155000.00));
        ls.add(new Movies("Avengers Endgame", 9.9f, 455000.00));
        ls.add(new Movies("Iron Man 3", 9.6f, 89000.00));

        System.out.println(ls);

        // Collections.sort(ls,new SortByMovieName());
        Collections.sort(ls,new SortByIMDBRating());
        // Collections.sort(ls,new SortByMovieCollection());

        System.out.println(ls);
    }
}
