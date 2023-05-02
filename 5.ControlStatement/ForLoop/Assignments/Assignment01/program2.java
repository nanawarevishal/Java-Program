
/*
        Program 2: Write a program to calculate the factorial of the given
        number.
        Input: 6
        Output: factorial 6 is 720
 */

 package ForLoop.Assignments.Assignment01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program2 {
    public static void main(String[] args)throws Exception {

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        int temp=num;

        int fact=1;

        for(int i=1;i<=num;i++){

            fact = fact *i;
            
        }

        System.out.print("Factorial of "+temp+" is "+fact);

        
    }
}
