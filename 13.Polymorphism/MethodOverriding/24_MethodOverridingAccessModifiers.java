package MethodOverriding;

class Parent24{

    final void fun(){
        System.out.println("Parent fun");
    }
}

class Child24 extends Parent24{
    
    void fun(){
        System.out.println("Child fun");
    }
}

class cliet24{
    public static void main(String[] args) {
        Parent24 obj = new Child24();
        obj.fun();
    }
}


/*
 Output:
        .\24_MethodOverridingAccessModifiers.java:12: error: fun() in Child24 cannot override fun() in Parent24
        void fun(){
                ^
        overridden method is final
        1 error
 */
