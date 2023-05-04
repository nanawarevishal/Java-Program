
/*
 Take N as input. Print its prime or not.
  If number (from 1 to N) is divisible by 1 and iself is called prime number.

  Input: 5
  Output: Prime

  Input : 8
  Output: Not a Prime

 */



package ForLoop.ClassCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program11 {
    public static void main(String[] args)throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        int cnt=0;
        for(int i=1;i<=num;i++){

            if(num % i==0){
                cnt++;
            }
        }

        if(cnt==2){
            System.out.println(num+" is a prime number.");
        }

        else{
            System.out.println(num+" is not a prime number.");
        }        
    }
}
