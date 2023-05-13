package SwitchCase.ClassCodes;

public class program6 {
    public static void main(String[] args) {

        int x = 5;
        switch (x) {

            case 1:
                System.out.println("1");
                break;

            case 2:
                System.out.println("First-2");
                break;

            case 5:
                System.out.println("first-5");
                break;

            case 5:
                System.out.println("Second-5");
                break;

            case 2:
                System.out.println("Second-2");
                break;

            default:
                System.out.println("No Match Found...!");
                break;

        }
    }
}

/*
 * 
 * program6.java:20: error: duplicate case label
 * case 2:
 * ^
 * 1 error
 * error: compilation failed
 * 
 */
