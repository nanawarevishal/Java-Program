package Static.StaticBlock;

class demo5{
    static int x =10;
    static {
        System.out.println("Static block 1");
    }

    // public static void main(String[] args) {
    //     System.out.println("In main 1");
    // }
}

class client{

    static int y =20;
    static {
        System.out.println("Static block 2");
    }

    // public static void main(String[] args) {
    //     System.out.println("In main 2");
    // }
}
