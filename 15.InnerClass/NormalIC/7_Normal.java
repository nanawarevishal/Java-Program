package NormalIC;

class Outer7{

    class Inner7{

        void fun2(){
            
            System.out.println("Inner fun");
        }

    }

    void fun1(){
        System.out.println("Outer fun");
    }
}

class client7{

    public static void main(String[] args) {
        Outer7.Inner7 obj = new Outer7().new Inner7();
        
    }
}