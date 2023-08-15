
package Instance.Constructor;

public class program13 {
    int x;
    int y =20;
    static int p;
    static int q =90;

    void fun(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(p);
        System.out.println(q);
    }

    public static void main(String[] args) {
        program13 obj = new program13();
        obj.fun();

        System.out.println(p);
        System.out.println(q);

    }
}
