package scopeOfVariables.ClassCodes;

public class program7 {
    public static void main(String[] args) {
        
        int x=10;

        {
            int x=20;
            System.out.println(x);
        }
        {
            int x=30;
            System.out.println(x);
        }

        System.out.println(x);
    }
}


/*

 Output: 
        program7.java:9: error: variable x is already defined in method main(String[])
                    int x=20;
                        ^
        program7.java:13: error: variable x is already defined in method main(String[])
                    int x=30;
                        ^
        2 errors
        error: compilation failed

 */
