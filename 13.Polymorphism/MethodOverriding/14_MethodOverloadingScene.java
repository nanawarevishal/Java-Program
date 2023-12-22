package MethodOverriding;

class Demo14{

    void fun(int x,int y){
        System.out.println("Char Para");
    }

    void fun(float x,float y){
        System.out.println("Int Para");
    }
}

class Client14{
    public static void main(String[] args) {
        Demo14 obj = new Demo14();
        obj.fun(10,10);
    }
}


/*
 Output:
    .\14_MethodOverloadingScene.java:17: error: reference to fun is ambiguous
        obj.fun(10,10);
           ^
    both method fun(float,int) in Demo14 and method fun(int,float) in Demo14 match
    1 error
 */
