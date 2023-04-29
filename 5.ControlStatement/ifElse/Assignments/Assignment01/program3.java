

/*
    Program 3: Write a java program, take a number, and print whether it is positive or
    negative.

    Input: num = 5
    Output: 5 is a positive number
    Input: num = -9
    Output: -9 is a negative number
    Input: num = 0
    Output: ???????


 */


package Assignment01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program3 {

    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        if(num < 0){

            System.out.println(num+" is negative number.");
        }
        else if(num==0){

            System.out.println(num+" is neither positive nor negative.");
        }

        else{
            System.out.println(num+" it is negative number.");
        }
        
    }
    
}
