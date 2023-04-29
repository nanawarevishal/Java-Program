
/*
 take an integer as input and print whether it is divisiblwe by 4 or not
 input 5:
 output: Not Divisible
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program4 {
    public static void main(String[] args)throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        if(num % 4==1){
            System.out.println("Not divisible");
        }

        else{
            System.out.println("Divisible");
        }

        
    }
}
