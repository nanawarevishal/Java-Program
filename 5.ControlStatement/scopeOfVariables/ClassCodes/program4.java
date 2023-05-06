package scopeOfVariables.ClassCodes;

public class program4 {
    public static void main(String[] args) {
        int x=20,y=10;

        {
            System.out.println(x+" "+y);
        }
        {
            int x=23;
            System.out.println(x+" "+y);
        }

        System.out.println(x+" "+y);
    }
}


/*

Output: 

        program4.java:11: error: variable x is already defined in method main(String[])
            int x=23;
                ^
        1 error
        error: compilation failed

 */
