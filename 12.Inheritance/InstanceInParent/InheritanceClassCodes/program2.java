package InstanceInParent.InheritanceClassCodes;

class Parent{

    Parent(){
        System.out.println("In Parent Constructor");
    }

    void property(){
        System.out.println("Flat-Car-Gold");
    }
    
}

class child extends Parent{

    child(){
        System.out.println("In Child Constructor");
    }
}

class client{
    public static void main(String[] args) {
        
        Parent obj1 = new child();
        // child obj2 = new Parent();

    }
}

/*

Output: 
        program2.java:21: error: incompatible types: Parent cannot be converted to child
                child obj2 = new Parent();
                            ^
        1 error
 */