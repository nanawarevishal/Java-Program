

/*
        Q4
        Write a program to take a range as input from the user and print perfect cubes between that range.
        Input: Enter start: 1
        Enter end: 100
        Output: perfect cubes between 1 and 100
 */



package NestedLoop.Assignment.Assignment06;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class program4 {

    public static void main(String[] args)throws Exception {
        
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the start and end: ");

        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());

        for(int i=start;i*i*i<=end;i++){

           System.out.print(i*i*i+" ");
        }
    }
}