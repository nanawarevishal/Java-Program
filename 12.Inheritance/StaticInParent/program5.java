package StaticInParent;


class Parent5{
    int x =10;
    static int y = 20;

    Parent5(){
        System.out.println("In Parent Constructor");
    }
}

class child5 extends Parent5{
    int x = 100;
    static int y = 200;

    child5(){
        System.out.println("In Child Constructor");
    }

    void access(){
        System.out.println(x);
        System.out.println(y);
    }
}

class client5{
    public static void main(String[] args) {
        child5 obj = new child5();

        obj.access();
    }
}
