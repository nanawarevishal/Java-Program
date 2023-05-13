package SwitchCase.ClassCodes;

public class program8 {
    public static void main(String[] args) {
        
        int x = 7;

        int y=7;
        switch (x) {

            case 1:
                System.out.println("One");

            case 2:
                System.out.println("Two");

            case 3:
                System.out.println("Three");

            case 4:
                System.out.println("Four");

            case y:
                System.out.println("Five");

            default:
                System.out.println("No Match Found...!");

        }

        System.out.println("After switch"); 
    }
}


/*


program8.java:23: error: constant expression required
            case y:
                 ^
1 error
error: compilation failed

 */
