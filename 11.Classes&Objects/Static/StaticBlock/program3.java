package Static.StaticBlock;

class demo3{
    
    static {
        System.out.println("Static block");
        System.exit(0);
        
    }
    
    public static void main(String[] args) {
        System.out.println("In main.....!");
    }

}