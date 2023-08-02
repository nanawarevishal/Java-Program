package MethodOverriding;

class Parent7{

    Parent7(){

        System.out.println("In Parent Constructor");
    }

    int fun(){
        System.out.println("In Parent fun");
        return 0;
    }
}

class child7 extends Parent7{

    child7(){
        System.out.println("In Child Constructor");
    }

     void marry(){
        System.out.println("Child selected Girl");
    }

    float fun(){
        System.out.println("In child fun");
        return 0.0f;
    }

}

class Client7{
    public static void main(String[] args) {
        Parent7 obj = new child7();
        obj.fun();
    }
}


/*

 Output:
        .\7_MethodOverridingScene.java:26: error: fun() in child7 cannot override fun() in Parent7
        float fun(){
                ^
        return type float is not compatible with int
        1 error


 */