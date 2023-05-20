

/*
        write a program to print the following pattern
        5 4 3 2 1
        8 6 4 2
        9 6 3
        8 4
        5
 */



package NestedLoop.Assignment.Assignment05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class program3 {
    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows: ");

        int row = Integer.parseInt(br.readLine());

        int num = row;
        for(int i=1;i<=row;i++){

           int num1 = num*i;

           for(int j=1;j<=row-i+1;j++){

                System.out.print(num1+" ");
                num1 -=i;
           }

           num--;
           System.out.println();

    }
}
}