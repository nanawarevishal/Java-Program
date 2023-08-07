package Interface;

interface parent{
    int x = 10;
    
    static int y =29;

    static {
        System.out.println("Static block");
    }
    
    static void gun(){
        System.out.println("interface gun method");
    }

    void fun();
}

class child implements parent{

    public void fun(){

    }
}

/*

Output:

        .\2_interface.java:8: error: initializers not allowed in interfaces
            static {
                ^
        1 error
        
 */