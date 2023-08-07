package AbstractClass;

abstract class Parent1{

    void career(){
        System.out.println("Doctor");
    }

    void marry();
}

class Child1 extends Parent1{

}

class Client1{

}


/*
 Output:
        .\1_Abstract.java:9: error: missing method body, or declare abstract
        void marry();
                ^       
        1 error
 */

