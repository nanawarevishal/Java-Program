package NormalIC;

class Outer10{

    int z =20;
    static int x =10;

    class Inner10{

        int z =30;
        static int y =90;    // In version 8 - 11 not allowed


        void fun(){
            System.out.println(z);
        }
    }
}

class Client10{

    public static void main(String[] args) {

        Outer10 obj1 = new Outer10();

        System.out.println(obj1.new Inner10().y);   // to fill the constructor with this and this$0 of inner class

        Outer10.Inner10 obj = new Outer10().new Inner10();
        System.out.println(obj.y);

        System.out.println(Outer10.Inner10.y);
    }
}