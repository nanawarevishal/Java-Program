package collection.list.Vector;

import java.util.Vector;

class vect0r{

    public static void main(String[] args) {
        
        Vector v = new Vector<>();

        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);

        System.out.println(v);

        System.out.println(v.capacity());

    }
}