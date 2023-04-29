/*
 
        Program 4: Write a java program that checks a number from 0 to 5 and prints its
        spelling, if the number is greater than 5 print the number is greater than 5
        Input1 : var= 4
        Output: four
        Input2 : var = 6
        Output: number is greater than 5
        Input3 : var = -6
        Output: ???

 */


package Assignment01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program4 {

    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        if(num==0){
            System.out.println("zero");
        }

        else if(num==1){
            System.out.println("One");
        }
        else if(num==2){
            System.out.println("Two");
        }
        else if(num==3){
            System.out.println("Three");
        }
        else if(num==4){
            System.out.println("Four");
        }

        else if(num==5){
            System.out.println("Five");
        }

        else if(num > 5){
            System.out.println(num+" is greater than 5.");
        }

        else{
            System.out.println(num+" is negative number.");
        }
    }
    
}
