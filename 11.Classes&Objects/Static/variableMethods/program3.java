package Static.variableMethods;

class staticdemo{
    static int x =10;
    static int y=20;

    static void disp(){
        System.out.println(x);
        System.out.println(y);
    }

}

class client{
    public static void main(String[] args) {
        System.out.println(staticdemo.x);
        System.out.println(staticdemo.y);

        staticdemo.disp();
    }
}