package Interface;


interface parent4{
    int x =10;
    static int y = 20;
    
    static void fun(){
        System.out.println("Fun method");
    }

    private void gun(){
        System.out.println("gun method");
    }
}

class child4 implements parent4{
    public static void main(String[] args) {
        parent4 obj = new child4();
        System.out.println(obj.x);
        System.out.println(obj.y);

        parent4.fun();
        // parent4.gun();
    }
}