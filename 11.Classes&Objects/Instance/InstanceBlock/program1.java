package Instance.InstanceBlock;

class demo1{
    static{
        System.out.println("In static block");
    }

    {
        System.out.println("In Instance Block");
    }

    demo1(){
        System.out.println("In Costructor");
    }

    // public static void main(String[] args) {

    //     System.out.println("In main");
    // }
}

class cliet{
    public static void main(String[] args) {
        demo1 obj1 = new demo1();
        // demo1 obj2 = new demo1();
    }
}
