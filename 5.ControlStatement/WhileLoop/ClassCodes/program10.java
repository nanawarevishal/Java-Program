
/*
  Write a program to reverse the given number.
  Input: 123
  Output: 321
 */

package WhileLoop.ClassCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program10 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        int temp = num;
        int rev = 0;

        while (temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }

        System.out.println(rev);

    }
}
