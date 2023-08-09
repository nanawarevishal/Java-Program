package MethodOverriding;

class Parent25{

    void fun(){
        System.out.println("Parent fun");
    }

    static void gun(){
        System.out.println("Gun");
    }
}

class Child25 extends Parent25{
    
    public void fun(){
        
        System.out.println("Child fun");
    }
}

class client25{
    public static void main(String[] args) {
        Parent25 obj = new Child25();
        obj.fun();
        obj.gun();   // reference od parent due to which the it bind at the compile time.
    }
}