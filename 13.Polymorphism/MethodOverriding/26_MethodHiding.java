package MethodOverriding;

class Parent26{

    static void fun(){

        System.out.println("Parent fun");
    }
}

class Child26 extends Parent26{

    static void fun(){
        
        System.out.println("Child Fun");
    }
}

class client26{

    public static void main(String[] args) {
        // Parent26 obj = new Parent26();
        // obj.fun();

        // Parent26 obj1 = new Child26();
        // obj1.fun();                              // Compiler Decision is final here i.e reference of the compiler is checked here.

        // Child26 obj2 = new Child26();
        // obj2.fun();
    }
}


