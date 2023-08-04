package MethodOverriding;

class Parent22{

    public void fun(){                                 // public access
        System.out.println("Parent fun");
    }
}

class Child22 extends Parent22{

    void fun(){                                         // default access
        System.out.println("Child Fun");
    }
}

class Client22{
    public static void main(String[] args) {
        Parent22 obj = new Child22();
        obj.fun();
    }
}


/*

 Output:

        .\22_MethodOverridingAccessSpecifier.java:12: error: fun() in Child22 cannot override fun() in Parent22
        void fun(){
                ^
        attempting to assign weaker access privileges; was public
        1 error

 */