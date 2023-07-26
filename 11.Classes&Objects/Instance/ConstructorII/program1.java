package Instance.ConstructorII;

class demo1{

    int x = 10;
    demo1(){   // Internal call demo1(demo1 this)

        //super
        System.out.println("In Constructor");
        // System.out.println(x);
    }

    void fun(){                // fun(demo1 this)
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(this);

    }

    public static void main(String[] args) {
        demo1 obj1 = new demo1();
        // demo1 obj2 = new demo1();
        // demo1 obj3 = new demo1();
        // demo1 obj4 = new demo1();
        System.out.println(obj1);

        obj1.fun();
    }
}