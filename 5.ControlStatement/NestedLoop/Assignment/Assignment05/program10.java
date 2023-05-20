
/*

            Q10
            write a program to print a series of prime numbers from entered range. ( Take a start and end
            number from a user )
            Perform dry run at least from 10 to 20 ...
            Input:-
            Enter starting number: 10
            Enter ending number: 100
            Output:-
            Series = 11 13 17 19 ..... 89 97

 */



package NestedLoop.Assignment.Assignment05;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class program10 {

    public static void main(String[] args)throws Exception {
        
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the start and end: ");

        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());

        for(int i=start;i<=end;i++){
            int count=0;
            for(int j=2;j<=Math.sqrt(i);j++){

                if(i % j==0){
                    count++;
                }
            }

            if(count==0){
                System.out.print(i+" ");
            }
        }
    }
    
}
