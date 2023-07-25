package Static.variableMethods;

class demo4{
    int x =10;
    static int y =20;

    void fun1(){
        System.out.println(x);
        System.out.println(y);
    }

    static void fun2(){
        System.out.println(y);
    }


}

class client{
    public static void main(String[] args) {
        // demo4.fun1();
        demo4.fun2();
    }
}


/*
 Output:
    .\program4.java:21: error: non-static method fun1() cannot be referenced from a static context
        demo4.fun1();
             ^       
1 error
 */
