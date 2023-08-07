package AbstractClass;

abstract class Parent2{

    void career(){
        System.out.println("Doctor");
    }

    abstract void marry();
}

class Child2 extends Parent2{

}

class Client2{

}


/*

 Ouptut:
    .\4_Abstract.java:12: error: Child2 is not abstract and does not override abstract method marry() in Parent2
        class Child2 extends Parent2{
        ^
        1 error
        
 */