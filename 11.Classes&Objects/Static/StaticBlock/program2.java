package Static.StaticBlock;

class demo2{
    
    int x =10;
    static int y =20;
    static {
        System.out.println("Static block 1");
    }

    void fun(){
        System.out.println(x);
    }

    public static void main(String[] args) {
        System.out.println("In main.....!");
        demo2 obj = new demo2();
    
        // System.out.println(System.identityHashCode(obj));
    }

    static {

        demo2 obj = new demo2();
        System.out.println(obj.x);
        // System.out.println(System.identityHashCode(obj));
        System.out.println("Static block 2");
    }
}