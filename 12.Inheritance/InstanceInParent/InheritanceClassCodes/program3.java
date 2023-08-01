package InstanceInParent.InheritanceClassCodes;

class Parent1{

    int x =10;
    Parent1(){
        System.out.println(this);
        System.out.println(x);
        System.out.println("In Parent1 Constructor");
    }

    void property(){
        System.out.println("Flat-Car-Gold");
    }
    
}

class child1 extends Parent1{

    child1(){
        System.out.println("In Child Constructor");
    }
}

class client1{

    public static void main(String[] args) {
        
        // Parent1 obj1 = new Parent1();
        // obj1.property();
        child1 obj2 = new child1();
        // obj2.property();
        System.out.println(obj2);

    }
}