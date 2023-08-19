package StaticInParent;


class Parent6{
    int x =10;
    static int y = 20;

    static {
        System.out.println("In Parent static Block");
    }

    {
        System.out.println("In Parent Instance Block");
    }

    Parent6(){
        System.out.println("In Parent Constructor");
    }

    void access(){
        System.out.println(x);
        System.out.println(y);
    }

}

class child6 extends Parent6{
    int x = 100;
    static int y = 200;

     static {
        System.out.println("In Child static Block");
    }

    {
        System.out.println("In Child Instance Block");
    }

    child6(){
        System.out.println("In Child Constructor");
    }

    void access(){
        super.access();
        System.out.println(super.x);
        System.out.println(super.y);
    }
}

class client6{
    public static void main(String[] args) {
        Parent6 obj = new child6();
        System.out.println(obj.x);
        System.out.println(obj.y);
        // obj.access();
    }
}
