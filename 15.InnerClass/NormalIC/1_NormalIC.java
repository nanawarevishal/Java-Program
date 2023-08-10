

package NormalIC;


class Outer{

    class Inner{
        
        void fun(){
            System.out.println("Inner Fun");
        }
    }

    void fun(){
        System.out.println("Outer Fun");
    }
}

class client{
    public static void main(String[] args) {
        Outer obj = new Inner();
    }
}


/*

 Output:
        .\1_NormalIC.java:22: error: cannot find symbol
        Outer obj = new Inner();
                                ^       
        symbol:   class Inner
        location: class client        
        1 error
        
 */