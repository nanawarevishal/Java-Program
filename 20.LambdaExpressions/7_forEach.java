import java.util.ArrayList;

class ForExach{

    public static void main(String[] args) {
        
        ArrayList<Integer> ls = new ArrayList<>();

        ls.add(10);
        ls.add(30);
        ls.add(20);
        ls.add(40);

        ls.forEach((data)->System.out.println(data));
    }
}