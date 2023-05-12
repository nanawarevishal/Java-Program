

/*
 write a program to print the following pattern
10 10 10 10
11 11 11
12 12
13
 */



package NestedLoop.Assignment.Assignment03;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program5 {
    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        int num=10;
        for(int i=1;i<=row;i++){

            for(int j=1;j<=(row-i+1);j++){
                System.out.print(num+" ");
                
            }
            num++;
            System.out.println();
        }
    }

}
