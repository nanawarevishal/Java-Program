

/*
Program 1: Write a java program to check if a number is even or odd.

        Input: var=10;
        Output: 10 is an even no
        Input: var=37;
        Output: 37 is an odd no
        Input : var = 0
        Output: ???
 */

package Assignment01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program1 {
    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        if(num % 2==1){
            System.out.println(num+" is an odd no.");
        }
        
        else{
            System.out.println(num+" is an even no.");
        }

    }
}
