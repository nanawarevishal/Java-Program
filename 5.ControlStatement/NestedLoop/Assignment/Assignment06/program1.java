

/*

        Q1
        Write a program to print the numbers divisible by 5 from 1 to 50 & the number is even also print the
        count of even numbers.
        Input: Enter a lower limit: 1
        Enter upper limit: 50
        Output: 10, 20, 30, 40, 50
        Count = 5
 */


package NestedLoop.Assignment.Assignment06;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class program1 {

    public static void main(String[] args)throws Exception {
        
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the start and end: ");

        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());

        int cnt=0;
        for(int i=start;i<=end;i++){

            if(i%5==0 && i%2==0){
                cnt++;
            }
        }

        System.out.print(cnt+"");

    }
}
