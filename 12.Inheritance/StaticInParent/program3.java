package StaticInParent;

class Parent3{

    static int x = 10;

    static {

        // static int x =10;
        System.out.println("In parent static block");
    }

    static void access(){
        System.out.println(x);
    }
}

class child3 extends Parent3 {

    static {
        // System.out.println(x);
        System.out.println("In child static block");
        access();
    }

}

class client3{

    public static void main(String[] args) {

        child3 obj = new child3();

    }
}