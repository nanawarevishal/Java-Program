
/*
  Write a program to check whether the number is a palinfrome number or not (2332)

  Output : 2332 is a palindrome number.
 */

package WhileLoop.ClassCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program11 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        int temp = num;
        int sum = 0;

        while (num != 0) {
            int rem = num % 10;
            sum = sum * 10 + rem;
            num /= 10;

        }
        if (temp == sum) {
            System.out.println(temp + " is a palindrome number");
        } else {
            System.out.println(temp + " is not a palindrome number");
        }

    }
}
