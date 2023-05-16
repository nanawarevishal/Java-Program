
/*
        Q3
        Write a program in which the user should enter two numbers if both the numbers are positive
        multiply them and provide to switch case to verify whether the number is even or odd, if the user
        enters any negative number program should terminate by saying “Sorry negative numbers not
        allowed”

 */

package SwitchCase.Assignment.Assignment01;

import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter number 1 = ");
        num1 = sc.nextInt();
        System.out.print("Enter number 2 = ");
        num2 = sc.nextInt();
        if (num1 < 0 || num2 < 0) {
            System.out.println("Negative numbers not allowed");
        } else {
            switch ((num1 * num2) % 2) {
                case 0:
                    System.out.println("The multiplication is even ");
                    break;
                case 1:
                    System.out.println("The multiplication is odd");
                    break;

            }
        }
    }
}