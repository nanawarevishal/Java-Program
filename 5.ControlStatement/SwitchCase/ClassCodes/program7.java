package SwitchCase.ClassCodes;

public class program7 {
    public static void main(String[] args) {
        int x = 5;
        switch (x) {

            case 1:
                System.out.println("1");
                break;

            case 1+1:
                System.out.println("1+1");

            case 1+2:
                System.out.println("1+2");

            case 2:
                System.out.println("First-2");
                break;

            default:
                System.out.println("No Match Found...!");
                break;
        }
    }
}
