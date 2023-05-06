package scopeOfVariables.ClassCodes;

public class program5 {
    public static void main(String[] args) {
        int x=10;
        {
            int y=20;
            System.out.println(x+" "+y);
        }
        {
            
            System.out.println(x+" "+y);
        }
        System.out.println(x+" "+y);
    }
}

/*

    program5.java:11: error: cannot find symbol
                System.out.println(x+" "+y);
                                        ^
    symbol:   variable y
    location: class program5
    program5.java:13: error: cannot find symbol
            System.out.println(x+" "+y);
                                    ^
    symbol:   variable y
    location: class program5
    2 errors
    error: compilation failed

 */
