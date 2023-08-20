package StaticNestedIC;

import StaticNestedIC.Outer3.Inner3;

class Outer3{

    void fun(){
        System.out.println("Outer fun");
    }

    static class Inner3{
        
        void fun(){
            System.out.println("Inner fun");
        }
    }
}

class Client3{
    public static void main(String[] args) {
        
        Outer3.Inner3 obj = new Inner3();
        Outer3.Inner3 obj1 = new Outer3.Inner3();
    }
}