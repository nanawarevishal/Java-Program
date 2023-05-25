package ClassCodes;

public class methodDemo3 {

    int x=10;
   static final int z =90;

    static int y=20;

    void fun(){
        System.out.println(x);
        System.out.println(y);
        // System.out.println(z);
        
    }
    public static void main(String[] args) {
        
        methodDemo3 obj = new methodDemo3();

        obj.fun();
        System.out.println(z);
    }
}
