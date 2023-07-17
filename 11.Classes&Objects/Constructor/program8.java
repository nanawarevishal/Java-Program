package Constructor;

class demo2{
    int x =10;
    int y=20;
    void disp(){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        demo2 obj = new demo2();
        obj.disp();
    }
}
