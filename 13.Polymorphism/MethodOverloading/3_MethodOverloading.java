package MethodOverloading;

class demo3{

    static void  gun(int x){
        System.out.println(x);
    }

    static void  gun(Float x){
        System.out.println(x);
    }
    
    static void  gun(demo3 obj){
        System.out.println(obj);
    }

    void fun(int x){
        System.out.println(x);
    }

    void fun(float x){
        System.out.println(x);
    }

    void fun(demo3 obj){
        System.out.println("In demo para");
        System.out.println(obj);
    }

    public static void main(String[] args) {
        demo3 obj = new demo3();
        obj.fun(10);
        obj.fun(10.5f);
        obj.fun(obj);

    }
}
