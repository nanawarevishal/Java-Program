package Interface;

interface p18{
    
    static void fun(){
        System.out.println("P1 fun");
    }
}

interface parent18{
    static void fun(){
        System.out.println("parent 15");
    }
}

class child18 implements p18,parent18{
    static void fun(){
        System.out.println("In child static");
    }
}

class client18{
    public static void main(String[] args) {
        
        parent18 obj1 = new child18();
        
        child18 obj2 = new child18();
        obj2.fun();
    }
}

