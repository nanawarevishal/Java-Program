package Static.StaticBlock;

class demo7{
    static int x =10;

    static{
        fun();
        System.out.println(x);
    }

    void fun(){
        System.out.println("In fun...!");
    }

    public static void main(String[] args) {
        
    }
}
