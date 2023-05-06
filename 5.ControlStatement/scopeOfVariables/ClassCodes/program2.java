package scopeOfVariables.ClassCodes;

public class program2 {
    public static void main(String[] args) {
        int x=10;
        int x=20;

        System.out.println(x);
    }
}


/*
program2.java:6: error: variable x is already defined in method main(String[])
    int x=20;
        ^
1 error
error: compilation failed
 */
