package Interface;


interface parent14{

    default void fun(){
        System.out.println("Parent default fun");
    }

    static void run(){
        System.out.println("In Parent run");
    }
}

class child14 implements parent14{

    public static void run(){
        System.out.println("In Child run");
    }

    public void fun(){
        System.out.println("In Fun child");
    }
}

class client14 {
    public static void main(String[] args) {
        parent14 obj = new child14();
        obj.fun();
        
        child14 obj1 = new child14();
        obj1.run();
    }
}