package OOP_ClassCodes;

class Demo1{

    static int x = 10;
    int y = 20;

    static {
        int a = 10;
        System.out.println(a);
        System.out.println("In Static block I");
        System.out.println(p);
    }

    {
        System.out.println("In Instance block I ");
    }

    public static void main(String[] args) {
        
        Demo1 obj = new Demo1();
    }

    static int p  = 99;

    static {
        System.out.println("In Static block II");
        System.out.println(p);
    }

    {
        System.out.println("In Instance block II ");
    }
}