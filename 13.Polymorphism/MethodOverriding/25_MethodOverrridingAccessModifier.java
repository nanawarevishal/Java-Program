package MethodOverriding;

class Parent25{

    void fun(){
        System.out.println("Parent fun");
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
    }
}