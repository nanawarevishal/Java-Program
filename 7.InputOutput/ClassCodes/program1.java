
package ClassCodes;

// import java.util.Scanner;

public class program1{
    public static void main(String[] args) {
       
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            String name= obj.nextLine();

            System.out.println(name);
        }
    }
}

/*
        program1.java:9: error: cannot find symbol
                try (Scanner obj = new Scanner(System.in)) {
                    ^
        symbol:   class Scanner
        location: class program1
        program1.java:9: error: cannot find symbol
                try (Scanner obj = new Scanner(System.in)) {
                                    ^
        symbol:   class Scanner
        location: class program1
        2 errors
        error: compilation failed
 */