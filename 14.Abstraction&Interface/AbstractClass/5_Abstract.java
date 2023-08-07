package AbstractClass;

abstract class Parent5{

    void career(){
        System.out.println("Doctor");
    }

    abstract void marry();
}

class Child5 extends Parent5{
    void marry(){
        System.out.println("Kriti Sanon");
    }

    void income(){
        System.out.println("In Come");
    }
}

class Client5{
    public static void main(String[] args) {
        Parent5 obj = new Child5();
        obj.career();
        obj.marry();
        obj.income();
    }

}


/*

 Output:
        .\5_Abstract.java:27: error: cannot find symbol
        obj.income();
           ^
        symbol:   method income()
        location: variable obj of type Parent5
        1 error
        
 */
