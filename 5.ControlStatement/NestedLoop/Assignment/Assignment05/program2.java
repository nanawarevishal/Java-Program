
/*
            Q2
            write a program to print the following pattern
            # = = = =
            = # = = =
            = = # = =
            = = = # =
            = = = = #

 */

package NestedLoop.Assignment.Assignment05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class program2 {
    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows: ");

        int row = Integer.parseInt(br.readLine());


        for(int i=1;i<=row;i++){

            for(int j=1;j<=row;j++){

                if(i==j){
                    System.out.print("#"+" ");
                }

                else{
                    System.out.print("="+" ");
                }
               
            }

            System.out.println();

    }
}
}
