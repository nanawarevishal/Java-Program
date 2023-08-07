package AbstractClass;

abstract class Parent3{

    void career(){
        System.out.println("Doctor");
    }

    abstract void marry();
}

class Client3{
    Parent3 obj = new Parent3();
}


/*

 Output:

        .\3_Abstract.java:13: error: Parent3 is abstract; cannot be instantiated
        Parent3 obj = new Parent3();
                  ^
        1 error
        
 */