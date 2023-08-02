package MethodOverriding;

class Parent6{

    Parent6(){

        System.out.println("In Parent Constructor");
    }

    void fun(){
        System.out.println("In Parent fun");
    }
}

class child6 extends Parent6{

    child6(){
        System.out.println("In Child Constructor");
    }

     void marry(){
        System.out.println("Child selected Girl");
    }

    void fun(int x){
        System.out.println("In child fun");
    }

}

class Client6{
    public static void main(String[] args) {
        Parent6 obj = new child6();
        obj.fun();
    }
}