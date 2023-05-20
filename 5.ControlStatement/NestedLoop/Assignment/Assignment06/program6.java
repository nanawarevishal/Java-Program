
/*

        Q6
        Write a program to take 5 numbers as input from the user and print the count of digits in those
        numbers.
        Input: Enter 5 numbers :
        5
        The digit count in 5 is 1
        25
        The digit count in 25 is 2
        225
        The digit count in 225 is 3
        6548
        The digit count in 6548 is 4
        852347
        The digit count in 852347 is 6

 */

package NestedLoop.Assignment.Assignment06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program6 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");

        int start = Integer.parseInt(br.readLine());

            int cnt=0;
            int temp = start;
            while (temp != 0) {

                temp /=10;
                cnt++;

            }

            System.out.println(cnt);
        }
    }

