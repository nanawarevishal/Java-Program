package ClassCodes;

import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the name: ");
        String name= obj.next();

        System.out.println("Enter your age: ");
        String age = obj.nextInt();

        System.out.println(name);
        System.out.println(age);
    }
}


/*
        program2.java:14: error: incompatible types: int cannot be converted to String
                String age = obj.nextInt();
                                        ^
        1 error
        error: compilation failed

 */
