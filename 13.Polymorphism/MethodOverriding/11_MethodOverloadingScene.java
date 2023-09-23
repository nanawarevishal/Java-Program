package MethodOverriding;


class Demo11{

    void fun(int x){
        System.out.println("Int Para");
    }

}

class Client11{
    public static void main(String[] args) {
        Demo11 obj = new Demo11();
        obj.fun('a');
    }
}
