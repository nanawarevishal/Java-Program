

package ClassCodes;
public class methodDemo2 {

    static int x =10;
    int y=20;

    static void gun(){
        System.out.println("Inside Gun method...!");
    }

    void fun(){
        System.out.println("Inside fun method...!");
    }

    public static void main(String[] args) {
        
        gun();
        System.out.println(x);

        System.out.println("After creating the object ");

        methodDemo2 obj = new methodDemo2();

        obj.fun();
        System.out.println(obj.y);
    }
}
