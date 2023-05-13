package SwitchCase.ClassCodes;

public class program5 {
    public static void main(String[] args) {

        int x = 8;

        switch (x) {

            default:
                System.out.println("No Match Found...!");
                break;

            case 1:
                System.out.println("One");

            case 2:
                System.out.println("Two");

            case 3:
                System.out.println("Three");

            case 4:
                System.out.println("Four");
            
            default:
                System.out.println("Another de");

            case 5:
                System.out.println("Five");

        }

        System.out.println("After switch");
    }
}


/*

 program5.java:26: error: duplicate default label
            default:     
                   ^     
1 error
error: compilation failed

 */
