package CommandLineArgument.ClassCodes;

public class program5 {
    static int fun(char x,double y){
        System.out.println(x);
        System.out.println(y);

        return -1;
    }

    public static void main(String[] args) {
        char ch = (char) -2;
        System.out.println(fun(ch,205.99999));
    }
}
