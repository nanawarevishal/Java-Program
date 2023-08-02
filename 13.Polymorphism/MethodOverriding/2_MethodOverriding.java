package MethodOverriding;

class Parent2{

    Parent2(){

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

class child2 extends Parent2{

    child2(){
        System.out.println("In Child Constructor");
    }

     void marry(){
        System.out.println("Child selected Girl");
    }

    // static void fun(){
    //     System.out.println("In child Static method");
    // }

    // public static void main(String[] args) {
    //     fun();
    // }
}

class Client2{
    public static void main(String[] args) {
        Parent2 obj = new child2();
        obj.Property();
        obj.marry();
    }
}