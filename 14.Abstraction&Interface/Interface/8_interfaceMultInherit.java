package Interface;

interface Parent86{
    int x =10;
    void fun();
}

interface Parent87{
    // int x =20;
    void fun();
}

class child8 implements Parent86,Parent87{

    static void sun(){
        System.out.println("In sun");
    }
    public void fun(){
        System.out.println("In fun");
    }

    static {
        
        System.out.println(x);    // Ambiguity if both
        System.out.println("In static block");
    }
}

class client8{
    public static void main(String[] args) {
        Parent86 obj = new child8();
        obj.fun();   
    }
}

