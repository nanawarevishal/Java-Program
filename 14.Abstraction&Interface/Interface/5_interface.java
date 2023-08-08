package Interface;

interface demo5{

    void fun();

}

interface child5 extends demo5{
    void gun();
}

abstract class client5 implements child5{

    // public void fun(){
    //     System.out.println("Fun Method");
    // }

    public void gun(){
        System.out.println("gun method");
    }
}

class c{
    public static void main(String[] args) {
        // client5 obj5 = new client5();
        // obj5.fun();
        // obj5.gun();
    }
}

