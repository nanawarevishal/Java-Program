package MethodOverriding;


class Parent18{

    int fun(){
        System.out.println("In Parent funs");
        return 0;
    }
}

class child18 extends Parent18{

     void marry(){
        System.out.println("Child selected Girl");
    }

    // float fun(){
    //     System.out.println("In child fun");
    //     return 0.0f;
    // }

}

class Client18{
    public static void main(String[] args) {
        Parent18 obj = new child18();
        obj.fun();
    }
}
