package SwitchCase.ClassCodes;

public class program11 {
    public static void main(String[] args) {

        int x = 7;

        int a = 1;
        int b = 2;
        switch (x) {

            case a:
                System.out.println("One");
                break;

            case b:
                System.out.println("2");
                break;

            case a + b:
                System.out.println(3);
                break;

            case b + b:
                System.out.println("4");
                break;

            case a + b + b:
                System.out.println("5");
                break;

            default:
                System.out.println("No Match Found...!");
                break;

        }

        System.out.println("After switch");
    }
}


/*
 
program11.java:12: error: constant expression required
            case a:
                 ^
program11.java:16: error: constant expression required
            case b:
                 ^
program11.java:20: error: constant expression required
            case a + b:
                   ^
program11.java:24: error: constant expression required
            case b + b:
                   ^
program11.java:28: error: constant expression required
            case a + b + b:
                       ^
5 errors
error: compilation failed

 */