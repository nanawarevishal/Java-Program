package MethodOverriding;

class Parent1{

    Parent1(){

        System.out.println("In Parent Constructor");
    }

    void fun(){
        System.out.println("In Parent fun method");
    }
}

class child1 extends Parent1{

    child1(){
        System.out.println("In Child Constructor");
    }

    void fun(){
        System.out.println("In Child Fun method");
    }
}

class Client1{
    public static void main(String[] args) {
        Parent1 obj = new child1();
        obj.fun();
    }
}