package MethodLocalIC;

class Outer2{

    void fun(){
        System.out.println("In Outer fun");

        class Inner2{

           private int x =10;
            static int y =20;

            static{
                int p =56;
                System.out.println(p);
            }

            {
                System.out.println("In instance 1");
            }
            void fun(){
                System.out.println("Inner fun");
            }

            static{
                int z =90;
                System.out.println(z);
            }

            Inner2(){
                System.out.println("In constructor");
            }

            {
                System.out.println("In Instance 2");
            }
        }

        Inner2 obj = new Inner2();
        obj.fun();
        System.out.println(obj.x);
        System.out.println(obj.y);

    }
    

    void gun(){

        System.out.println("In Outer Gun");
    }
}

class Client2{

    public static void main(String[] args) {
        
        Outer2 obj = new Outer2();
        obj.fun();
        obj.gun();

    }
}   