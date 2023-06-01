package CommandLineArgument.ClassCodes;

public class program1 {

    static void fun(int x,double y){
        System.out.println(x);
        System.out.println(y);

    }
    public static void main(String[] args) {
        System.out.println(fun(10,205.99999));
    }
}


/*

        program1.java:10: error: 'void' type not allowed here
                System.out.println(fun(10,205.12));
                                    ^
        1 error
        error: compilation failed

 */
