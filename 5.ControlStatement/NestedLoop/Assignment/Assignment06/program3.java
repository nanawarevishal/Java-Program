
/*

        Q3
        Write a program to take a range as input from the user and print perfect squares between that range.
        Input: Enter start: 1
        Enter end: 100
        Output: perfect squares between 1 and 100

 */



package NestedLoop.Assignment.Assignment06;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class program3 {

    public static void main(String[] args)throws Exception {
        
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the start and end: ");

        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());

        for(int i=start;i*i<=end;i++){

           System.out.print(i*i+" ");
        }
    }
}

