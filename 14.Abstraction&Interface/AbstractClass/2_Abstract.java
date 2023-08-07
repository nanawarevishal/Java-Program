package AbstractClass;

class Parent2{

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
 Output:
        .\2_Abstract.java:3: error: Parent2 is not abstract and does not override abstract method marry() in Parent2
        class Parent2{
        ^
        1 error
 */
