package ClassCodes;

public class methodDemo8 {

    void fun(int x){
        System.out.println("In fun..!");
        System.out.println(x);
    }
    public static void main(String[] args) {
        
        methodDemo8 obj = new methodDemo8();

        obj.fun('A');

    }
}
