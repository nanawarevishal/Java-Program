package MethodOverriding;

class Parent4{

    Parent4(){

        System.out.println("In Parent Constructor");
    }
}

class child4 extends Parent4{

    child4(){
        System.out.println("In Child Constructor");
    }

     void marry(){
        System.out.println("Child selected Girl");
    }

    void fun(){
        System.out.println("In child method");
    }

}

class Client4{
    public static void main(String[] args) {
        Parent4 obj = new child4();
        obj.fun();
    }
}


/*

Output:
        .\4_MethodOverriding.java:30: error: cannot find symbol
                obj.fun();
                ^
        symbol:   method fun()
        location: variable obj of type Parent4
        1 error
        

 */