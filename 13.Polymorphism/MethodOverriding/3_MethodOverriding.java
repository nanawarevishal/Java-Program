package MethodOverriding;

class Parent3{

    Parent3(){

        System.out.println("In Parent Constructor");
    }

    void Property(){
        System.out.println("Home-Gold-Car");
    }

    void marry(){
        System.out.println("Parent selected Girl");
    }

    static void fun(){
        System.out.println("In Parent static method");
    }
}

class child3
 extends Parent3{

    child3
    (){
        System.out.println("In Child Constructor");
    }

     void marry(){
        System.out.println("Child selected Girl");
    }

    static void fun(){
        System.out.println("In child Static method");
    }

    public static void main(String[] args) {
        fun();
    }
}

