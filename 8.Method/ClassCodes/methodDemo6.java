package ClassCodes;

public class methodDemo6 {

    int y =90;
    void fun(int x){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        methodDemo6 obj = new methodDemo6();

        obj.fun(10);

        System.out.println("End of the main function...!");
    }
}
