package ClassCodes;

public class methodDemo13 {

    void fun(float x){
        System.out.println(x);
    }
    public static void main(String[] args) {
        methodDemo13 obj = new methodDemo13();

        obj.fun(10);
        obj.fun(10.05f);
        obj.fun(true);
    }
}


/*

            methodDemo13.java:13: error: method fun in class methodDemo13 cannot be applied to given types;
                    obj.fun(true);
                    ^
            required: float
            found:    boolean
            reason: argument mismatch; boolean cannot be converted to float
            1 error
            error: compilation failed
            
 */

