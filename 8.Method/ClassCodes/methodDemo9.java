package ClassCodes;

public class methodDemo9 {

    void fun(char ch){
        System.out.println("In fun..!");
        System.out.println(ch);
    }
    public static void main(String[] args) {
        
        methodDemo9 obj = new methodDemo9();

        obj.fun(65);

    }
}


/*

            methodDemo9.java:13: error: method fun in class methodDemo9 cannot be applied to given types;
                obj.fun(65);
                ^
            required: char
            found:    int
            reason: argument mismatch; possible lossy conversion from int to char
            1 error
            error: compilation failed
            
 */
