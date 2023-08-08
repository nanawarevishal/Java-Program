package Interface;

interface parent9{
    int x = 10;
    void fun();
    default void gun(){
        System.out.println(x);
        System.out.println("In parent Gun");
    }
}

interface parent91{
    static void gun(){
        System.out.println("In Gun");
    }
}

class child9 implements parent9,parent91{
    public void fun(){
        System.out.println("In Fun");
    }
}

class client9{
    public static void main(String[] args) {
        parent9 obj = new child9();
        obj.fun();
        obj.gun();
        
    }
}
