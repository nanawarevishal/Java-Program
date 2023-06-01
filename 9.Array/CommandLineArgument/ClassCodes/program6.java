package CommandLineArgument.ClassCodes;

public class program6 {
    static int fun(int x,int y){
        System.out.println(x);
        System.out.println(y);

        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(y));
        return -1;
    }

    void gun(int x,int y){
        System.out.println(x);
        System.out.println(y);

        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(y));
    }

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        System.out.println(fun(x,y));

        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(y));


        System.out.println("After creating the object");
        program6 obj = new program6();
        obj.gun(x, y);
    }
}
