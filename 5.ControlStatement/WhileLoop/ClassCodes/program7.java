
/*
  Given an integer N
  print the sum of its digits 
  Assume: N>=0
  Input:6531
  output:15
 */

package WhileLoop.ClassCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program7 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        int sum = 0;

        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }

        System.out.println("Sum of the digit of number : " + sum);
    }
    
}
