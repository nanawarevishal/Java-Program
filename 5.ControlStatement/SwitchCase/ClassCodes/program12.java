package SwitchCase.ClassCodes;

public class program12 {
    public static void main(String[] args) {

        String str = "Mon";

        switch (str) {
            case "MON":
                System.out.println("MONDAY");
                break;

            case "Mon":
                System.out.println("Monday");
                break;

            case "mon":
                System.out.println("monday");
                break;

            default:
                System.out.println("No Match Found....!");
                break;
        }
    }
}


/*

 Before java 1.6 it is not working it gives an error but after that 1.7 they added.
 
 */