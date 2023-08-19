package Instance.InstanceBlock;

public class program2 {

    int x =90;

    {
        System.out.println(x);
    }


    void fun(){
        System.out.println("In fun");
    }

    public static void main(String[] args) {
        program2 obj = new program2();
    }
}
