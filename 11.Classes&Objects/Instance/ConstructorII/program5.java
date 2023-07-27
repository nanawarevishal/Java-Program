package Instance.ConstructorII;


class Demo5{
    int x =10;
    Demo5(){
        this(20);
        System.out.println(x);
        System.out.println("In No-Args Constructor...");
        System.out.println(this);
    }

    Demo5(int x){
        // this();
        System.out.println(x);
        System.out.println("In Para Costructor...");
        System.out.println(this);
    }

    public static void main(String[] args) {
        Demo5 obj1 = new Demo5();
        System.out.println(obj1);
        // Demo5 obj2 = new Demo5(20);
    }
}
