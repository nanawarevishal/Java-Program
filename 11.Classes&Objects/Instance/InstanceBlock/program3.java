package Instance.InstanceBlock;

public class program3 {

    int x = 10;

    {
        System.out.println("instatnce block");
    }

    program3(){

        System.out.println(x);
        System.out.println("In constructor..!");
    }
    
    public static void main(String[] args) {

        program3 obj = new program3();

    }

    {
        System.out.println("Second instance block");
    }
}
