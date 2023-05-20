
/*

        Q5
        write a program to print the following pattern
        Row =4
        0
        1 1
        2 3 5
        8 13 21 34

 */

package NestedLoop.Assignment.Assignment05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program5 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows: ");

        int row = Integer.parseInt(br.readLine());

        int n1 = 0;
        int n2 = 1;
        int n3;
        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) {
                n3 = n1 + n2;
                System.out.print(n1 + " ");
                n1 = n2;
                n2 = n3;
            }

            System.out.println();

        }
    }
}
