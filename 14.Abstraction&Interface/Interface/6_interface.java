package Interface;

interface parent6{
    int x = 10;
    void fun();
    void gun();
    static void sun(){
        System.out.println(x);
    }
}

abstract class DemoChild implements parent6{
    
    public void fun(){
        System.out.println("In Fun");
        System.out.println(x);
    }
}

class child6 extends DemoChild{
    public void gun(){
        System.out.println("In Gun");
        System.out.println(parent6.x);
    }

    static void run(){
        System.out.println(x);
    }
}

class Client6{
    public static void main(String[] args) {
        parent6 obj = new child6();
        obj.fun();
        obj.gun();
        parent6.sun();
    }
}