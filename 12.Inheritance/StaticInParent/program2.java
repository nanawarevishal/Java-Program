package StaticInParent;

class Parent2{
    static {
        System.out.println("In parent static block");
    }

    {
        System.out.println("In Parent instance block");
    }
}

class child2 extends Parent2 {

    static {
        System.out.println("In child static block");
    }

    {
        System.out.println("In Child instance block");
    }

}

class client2{
    public static void main(String[] args) {
        
        Parent2 obj = new child2();
    }
}