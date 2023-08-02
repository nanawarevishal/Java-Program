package MethodOverriding;

class Parent5{

    Parent5(){

        System.out.println("In Parent Constructor");
    }

    void fun(int x){
        System.out.println(x);
    }
}

class child5 extends Parent5{

    child5(){
        System.out.println("In Child Constructor");
    }

     void marry(){
        System.out.println("Child selected Girl");
    }

    void fun(){
        System.out.println("In child method");
    }

}

class Client5{
    public static void main(String[] args) {
        Parent5 obj = new child5();
        obj.fun();
    }
}


/*

 Output:
        .\5_MethodOverridingScene.java:34: error: method fun in class Parent5 cannot be applied to given types;
        obj.fun();
           ^
        required: int
        found:    no arguments
        reason: actual and formal argument lists differ in length
        1 error

 */

