package StaticInParent;

class Parent4{

    int x = 10;
    static int y = 20;

    static {
        System.out.println("In parent static block");
    }

    Parent4(){
        System.out.println("In parent Constructor");
    }

    void m1(){
        System.out.println(x);
        System.out.println(y);
    }

    static void m2(){
        System.out.println(y);
    }
}

class child4 extends Parent4 {

    static {

        System.out.println("In child static block");
    }

    child4(){
        System.out.println("In Child Constructor");
    }

}

class client4{

    public static void main(String[] args) {

        child4 obj = new child4();
        obj.m1();
        obj.m2();

    }
}