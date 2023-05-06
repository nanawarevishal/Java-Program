package scopeOfVariables.ClassCodes;

public class program6 {
    public static void main(String[] args) {
        int x=10;
        {
            int y=20;
            System.out.println(x+" "+y);
        }

        {
            int y=15;
            System.out.println(x+" "+y);

        }
        System.out.println(x+" "+y);
    }
}


/*

Output:

        program6.java:16: error: cannot find symbol
            System.out.println(x+" "+y);
                                        ^
        symbol:   variable y
        location: class program6
        1 error
        error: compilation failed
 */
