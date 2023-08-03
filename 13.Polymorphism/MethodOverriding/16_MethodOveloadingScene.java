package MethodOverriding;


class Demo16{

    void fun(String str){
        System.out.println("String Para");
    }

    void fun(StringBuffer str){
        System.out.println("In StringBuffer Para");
    }

    void gun(String str){
        System.out.println("String Para");
    }

    void gun(StringBuffer str){
        System.out.println("In StringBuffer Para");
    }

}

class Client16{
    public static void main(String[] args) {

        String str1 = null;
        StringBuffer sb = null;

        Demo16 obj = new Demo16();

        obj.fun(sb);
        obj.fun("Core2Web");
        obj.fun(new StringBuffer("Core2Web"));
        obj.fun(null);    //ambigious 
    }
}


/*

Output:
    error:reference to fun is ambigious.


 */