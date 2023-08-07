package Interface;

interface parent{
    int x = 10;
    
    static int y =29;
    
    static void gun(){
        System.out.println("interface gun method");
    }
    

    void fun();
}

class child1 implements parent{

    public void fun(){
        System.out.println("fun method child");
    }
}

class Client1{
    public static void main(String[] args) {
        parent obj = new child1();
        obj.fun();
        parent.gun();
    }
}
