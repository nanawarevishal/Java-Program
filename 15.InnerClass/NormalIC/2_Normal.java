package NormalIC;


class Outer2{

    class Inner2{

        void fun(){
            System.out.println("Inner fun");
        }
    }
    void gun(){
        System.out.println("Outer gun");
    }

}

class client2{

    public static void main(String[] args) {
        Outer2 obj1 = new Outer2();
        obj1.gun();

        Outer2.Inner2 obj2 = new Outer2().new Inner2();
        obj2.fun();

    }
}
