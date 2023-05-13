package SwitchCase.ClassCodes;

public class program9 {   
    public static void main(String[] args) {
        
        int ch = 65;

        switch (ch) {

            case 1:
                System.out.println("One");

            case 'A':
                System.out.println("65");
                break;

            case 65:
                System.out.println("second-65");


            default:
                System.out.println("No Match Found...!");

        }

        System.out.println("After switch");
    }
}

/*

 program9.java:17: error: duplicate case label
            case 65:     
            ^
1 error
error: compilation failed

 */
