
/*

        Q5
        Write a program to take range as input from the user and print perfect numbers.
        {Note: Perfect number is the one whose perfect divisor’s addition is equal to that number.
        6 is perfect number = 1 + 2 + 3 = 6}
        Input: Enter start: 1
        Enter end: 30
        Output: perfect numbers between 1 and 30
        6 28

 */

package NestedLoop.Assignment.Assignment06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program5 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the start and end: ");

        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        for (int i = start; i <= end; i++) {

            int temp = i;
            int sum = 0;

            for (int j = 1; j < i; j++) {

                if (i % j == 0) {
                    sum += j;
                }
            }

            if (i == sum) {
                System.out.print(i + " ");
            }
        }
    }
}