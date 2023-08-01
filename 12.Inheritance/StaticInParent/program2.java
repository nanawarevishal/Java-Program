package StaticInParent;

class Parent2{
    static {
        System.out.println("In parent static block");
    }
}

class child2 extends Parent2 {

    static {
        System.out.println("In child static block");
    }

}

class client2{
    public static void main(String[] args) {
        
        child2 obj = new child2();
    }
}