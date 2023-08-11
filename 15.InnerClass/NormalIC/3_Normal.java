package NormalIC;


class Outer3{

    int x =20;
    static int y =40;
    
    class Inner3{

        int x = 10;
        static int y = 30;

        static{
            Outer3 obj3 = new Outer3();
            obj3.fun();
            System.out.println("Inner Static block");
        }

        void fun(){
            System.out.println(x);
            System.out.println(y);
            System.out.println("Inner fun");
        }
    }

    static{
        Inner3 obj3 = new Outer3().new Inner3();
        obj3.fun();
        System.out.println("Outer Static block");
    }

    void fun(){

        System.out.println(x);
        System.out.println(y);
        System.out.println("Outer fun");
    }

}

class client3{

    public static void main(String[] args) {
        Outer3 obj1 = new Outer3();
        obj1.fun();

        // Outer3.Inner3 obj2 = new Outer3().new Inner3();
        // obj2.fun();

    }
}
