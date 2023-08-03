package MethodOverriding;


class Demo17{

    void fun(Object obj){
        System.out.println("Object");
    }

    void fun(StringBuffer str){
        System.out.println("In StringBuffer Para");
    }

    // void fun(String str){
    //     System.out.println("String para");
    // }

}

class Client17{
    public static void main(String[] args) {

        Object []arr = {10,"Str",'a',45.89,43.6f};
        Demo17 obj = new Demo17();
        obj.fun("Core2Web");
        obj.fun(null);

    }
}
