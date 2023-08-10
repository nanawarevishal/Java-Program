package Interface;

interface demo{
    default void gun(){
        System.out.println("In gun-demo");
    }
}

class childDemo implements demo{
    public void gun(){
        System.out.println("In fun demoChild");
    }
}

class Client{
    public static void main(String[] args) {
        demo obj = new childDemo();
        obj.gun();
    }
}