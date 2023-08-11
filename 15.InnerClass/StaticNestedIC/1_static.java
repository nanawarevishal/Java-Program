package StaticNestedIC;


class Outer1{

    void m1(){
        System.out.println("Outer m1");
    }

    static int x =10;

   static class Inner1{
        void m2(){
            System.out.println("Inner m2");
        }
    }
}

class Client1{

    public static void main(String[] args) {
        Outer1.Inner1 obj = new Outer1.Inner1();
        obj.m2();
        
    }
}