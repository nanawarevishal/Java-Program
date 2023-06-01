package CommandLineArgument.ClassCodes;

public class program7 {
    public static void main(String[] args) {
        String str= new String("ABC");

        String str1 = "ABC";

        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str1));
    }
}
