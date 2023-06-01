package CommandLineArgument.ClassCodes;

public class program4 {
    static int fun(char x,double y){
        System.out.println(x);
        System.out.println(y);

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(fun(10,205.99999));
    }
}


/*

        program4.java:12: error: method fun in class program4 cannot be applied to given types;
                System.out.println(fun(10,205.99999));
                                ^
        required: char,double
        found:    int,double
        reason: argument mismatch; possible lossy conversion from int to char
        1 error
        error: compilation failed

 */
