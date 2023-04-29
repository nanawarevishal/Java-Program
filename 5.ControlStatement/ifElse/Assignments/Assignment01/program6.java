
/*
 
        Program 6: write a program to find a maximum between three numbers
        inputs1 :
        num1 = 1
        num2 = 2
        num3 = 3
        Output: 3 is the maximum between 1, 2 and 3
        inputs2 :
        num1 = 1
        num2 = 4
        num3 = 3
        Output: 4 is the maximum between 1, 4 and 3

        inputs3 :
        num1 = 42
        num2 = 32
        num3 = 42
        Output: ?????

 */

package Assignment01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program6 {

    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number1: ");
        int num1 = Integer.parseInt(br.readLine());

        System.out.println("Enter the number2: ");
        int num2 = Integer.parseInt(br.readLine());

        System.out.println("Enter the number3: ");
        int num3 = Integer.parseInt(br.readLine());

        if(num1 >num2 && num1 > num3){
            System.out.println(num1+" is greater.");
        }

        else if(num2 >num1 && num2 >num3){
            System.out.println(num1+" is greater.");

        }
        else if(num3 >num1 && num3 >num2){
            System.out.println(num3+" is greater.");

        }
        else if(num2==num1 && num2 > num3){
            System.out.println(num1+"and "+num2+" are equal");

        }

        else if(num2==num3 && num1 < num3){
            System.out.println(num2+"and "+num3+" are equal");

        }

        else if(num1==num3 && num2 < num3){
            System.out.println(num1+"and "+num3+" are equal");

        }

        else{
            System.out.println("All are equal.");
        }

    }
    
}
