/*
    Program 10: Write a program to check whether the number is a Palindrome
    number or not. (2332)
    Output: 2332 is a palindrome number
 */

package WhileLoop.Assignments.Assignment01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program10 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number : ");
        int num = Integer.parseInt(br.readLine());

        int temp = num;
        int palindrome = 0;

        while (temp != 0) {

            int rem = temp % 10;

            palindrome = palindrome * 10 + rem;
            temp /= 10;

        }

        if (palindrome == num) {
            System.out.println(num + " is palindrome number.");
        }

        else {
            System.out.println(num + " is not a palindrome number.");
        }
    }
}
