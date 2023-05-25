package ClassCodes;

public class methodDemo7 {

    void fun(){
        System.out.println();
    }
    public static void main(String[] args) {
        
        methodDemo7 obj = new methodDemo7();
        obj.fun(x);

    }
}


/*

 Output: 
            .\methodDemo7.java:11: error: method fun in class methodDemo7 cannot be applied to given types;
                obj.fun();
                ^
        required: int
        found:    no arguments
        reason: actual and formal argument lists differ in length
        1 error
        error: compilation failed



        Second type:

                .\methodDemo7.java:11: error: cannot find symbol
                obj.fun(x);
                        ^
        symbol:   variable x
        location: class methodDemo7
        1 error
        error: compilation failed

 */
