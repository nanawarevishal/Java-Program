package StaticNestedIC;


class Outer2{

    void m1(){
        System.out.println("Outer m1");
    }

    static int x =10;

   static class Inner2{
        void m2(){
            System.out.println("Inner m2");
        }
    }

    public static void main(String[] args) {
        Inner2 obj = new Inner2();
        obj.m2();

        Outer2 obj1 = new Outer2();
        obj1.m1();
    }
    
}

// class Client2{

//     public static void main(String[] args) {
        
//         Outer1.Inner1 obj = new Outer1.Inner1();
//         obj.m2();
        
//     }
// }