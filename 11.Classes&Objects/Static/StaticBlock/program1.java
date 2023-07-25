package Static.StaticBlock;

class demo1{
    
    static int x =10;
    static {
        System.out.println("In static Block.....!");
    }

    public static void main(String[] args) {
        System.out.println("In main.....!");
    }

}

