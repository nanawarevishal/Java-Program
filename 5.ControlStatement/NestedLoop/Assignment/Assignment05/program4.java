
/*
 Q4
            WAP to print all even numbers in reverse order and odd numbers in the standard way. Both separately.
            Within a range. Take the start and end from user
            Input: Enter start number - 2
            Enter End number - 9
            Output:
            8 6 4 2
            3 5 7 9
 */

package NestedLoop.Assignment.Assignment05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Start and End of range");
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());


        System.out.print("Even Num: ");
        for (int i = end; i >= start; i--) {
            if (i % 2 == 0)
                System.out.print(i + " ");

        }
        
        System.out.println();
        System.out.print("Odd Num: ");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}