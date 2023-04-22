
// Write a program to find the LCM (Least Common Multiple) of two numbers.

package While;

import java.util.Scanner;


public class LCM {
    public static void main(String[] args) {
        try (Scanner Obj = new Scanner(System.in)) {
            System.out.println("Enter the First Number : ");
            int num1 = Obj.nextInt();

            System.out.println("Enter the Sec Number : ");
            int num2 = Obj.nextInt();
            
            int i = 1,commn = 0;
            while(i <= num1 || i <= num2){
            	
            	if(num1 % i == 0 && num2 % i == 0){
            		
            		commn = i;
            	}
            	i++;
            }
            int LCM = ((num1 * num2)/commn);
            System.out.println("LCM of "+ num1 + " & " + num2 + " is " + LCM);
        }
        
    }
    
}
