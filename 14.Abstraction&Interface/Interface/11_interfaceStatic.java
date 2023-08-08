package Interface;

interface parent1{
    int x =10;
    static void m1(){
        System.out.println("Parent1 m1");
    }

    default void fun(){
        System.out.println("In Fun");
    }
}

interface parent11{
    int x =20;
    static void m1(){
        System.out.println(x);
        System.out.println("Parent1 m2");
    }

    default void fun(){
        System.out.println("In fun");
    }
}

class child11 implements parent11{

    public static void main(String[] args) {
        System.out.println("In main");
        parent11 obj = new child11();
        parent11.m1();
        obj.fun();
        
    }
}


