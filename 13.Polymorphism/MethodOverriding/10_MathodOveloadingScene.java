package MethodOverriding;

class Demo10{

    void fun(int x){
        System.out.println("Int Para");
    }

    void fun(char ch){
        System.out.println("Char Para");
    }
}

class Client10{
    public static void main(String[] args) {
        Demo10 obj = new Demo10();
        obj.fun('a');
    }
}
