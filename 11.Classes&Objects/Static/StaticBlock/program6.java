package Static.StaticBlock;

class demo6{
    static int x =10;
    static {
        System.out.println("Static block 1");
    }
}

class client6{

    static int y =20;
    static {
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        System.out.println("In client main");
        demo6 obj = new demo6();

    }

    static {
        System.out.println("Static block 3");
    }
}
