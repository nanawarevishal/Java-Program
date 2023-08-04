package MethodOverriding;

class Parent21{

    void fun(){
        System.out.println("Parent fun");
    }
}

class Child21{

    void fun(){
        System.out.println("Child Fun");
    }
}

class Client21{
    public static void main(String[] args) {
        Parent21 obj = new Child21();
        obj.fun();
    }
}


/*

Output:
        .\21_MethodOverridingAccessSpecifier.java:19: error: incompatible types: Child21 cannot be converted to Parent21
                Parent21 obj = new Child21();
                            ^
        1 error
 */