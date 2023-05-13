package SwitchCase.ClassCodes;

public class program10 {
    
    public static void main(String[] args) {
        int ch = 65;

        switch (ch) {

            case 1:
                System.out.println("One");
                break;

            case 'A':
                System.out.println("65");
                break;

            case 65:
                System.out.println("Second-65");
                break;

            case 'B':
                System.out.println("B-65");
                break;

            case 66:
                System.out.println("66");
                break;


            default 65:
                System.out.println("No Match Found...!");

        }

        System.out.println("After switch");
    }
}

/*
 program10.java:18: error: : or -> expected
            default 65:
                   ^
program10.java:18: error: not a statement
            default 65:
                    ^
program10.java:18: error: ';' expected
            default 65:
                      ^
3 errors
error: compilation failed
 */
