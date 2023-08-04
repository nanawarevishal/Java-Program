package MethodOverriding;

class Parent23{

    private void fun(){                                
        System.out.println("Parent fun");
    }
}

class Child23 extends Parent23{

    void fun(){                                        
        System.out.println("Child Fun");
    }
}

class Client23{
    public static void main(String[] args) {

        Parent23 obj = new Child23();
        obj.fun();
    }
}


/*

 Output:
        .\23_MethodOverridingAccessSpecifier.java:21: error: fun() has private access in Parent23
        obj.fun();
           ^      
        1 error
        
 */