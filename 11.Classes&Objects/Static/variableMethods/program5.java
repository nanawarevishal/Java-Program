package Static.variableMethods;

class demo5{
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

class client5{
    public static void main(String[] args) {
        demo5.fun2();
    }
}