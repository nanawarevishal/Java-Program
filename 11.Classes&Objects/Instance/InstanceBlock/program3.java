package Instance.InstanceBlock;

public class program3 {

    static int x;

    static{
        System.out.println("In static block 1"+x);
    }

    {
        System.out.println("instatnce block");
    }

    program3(){

        System.out.println(x);
        System.out.println("In constructor..!");
    }
    
    public static void main(String[] args) {

        // program3 obj = new program3();
        x = 10;
    

    }

    static{
        System.out.println("In static block 2"+x);
    }

    {
        System.out.println("Second instance block");
    }
}
