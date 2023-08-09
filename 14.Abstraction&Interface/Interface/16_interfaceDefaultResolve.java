package Interface;

interface p16{
    
    default void fun(){
        System.out.println("P1 fun");
    }
}

interface parent16{
    default void fun(){
        System.out.println("parent 15");
    }
}

class child16 implements p16,parent16{

    public void fun(){
        System.out.println("In child fun");
    }
}


class client16{

    public static void main(String[] args) {
        child16 obj1 = new child16();
        obj1.fun();

        parent16 obj2 = new child16();
        obj2.fun();

        p16 obj3 = new child16();
        obj3.fun();
    }
}


// Default is used when some child class is agree with method and some of them not agree with the method
// then in this case not agree class will override and agreed class inherit that method.