package MethodOverriding;


class Demo12{

    void fun(float ch){
        System.out.println("Char Para");
    }

    void fun(int x){
        System.out.println("Int Para");
    }



}

class Client12{
    public static void main(String[] args) {
        Demo12 obj = new Demo12();
        obj.fun('a');
    }
}


/*
 Output:
    First it will check for the exact match and then it will look for the closest one i.e int.
 */

