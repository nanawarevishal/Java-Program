
/*
 Given an integer value as input
 print fizz if it is divisble by 3
 print buzz if it is divisble by 5
 print fizz-buzz if it is divisble by both

 if not then print "Not divisible by both"
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program6 {
    public static void main(String[] args)throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        if(num % 3==0 && num %5==0){
            System.out.println(num+" is divisible by both");
        }

        else if(num % 3==0){
            System.out.println(num+" is divisible by 3");
        }

        else if(num % 5==0){
            System.out.println(num+" is divisible by 5");
        }

        else{
            System.out.println("Not divisible by both");
        }
        
    }
}