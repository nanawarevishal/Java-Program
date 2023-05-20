
/*

            Q1
            write a program to print the following pattern
            D4 C3 B2 A1
            A1 B2 C3 D4
            D4 C3 B2 A1
            A1 B2 C3 D4


 */



package NestedLoop.Assignment.Assignment05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program1 {
    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows: ");

        int row = Integer.parseInt(br.readLine());

        char ch = (char)(64+row);
        int num = row;

        for(int i=1;i<=row;i++){

            for(int j=1;j<=row;j++){

                if(i%2==1){
                    System.out.print(ch);
                    System.out.print(num+" ");

                    ch--;
                    num--;
                }

                else{

                    ch++;
                    num++;
                    System.out.print(ch);
                    System.out.print(num+" ");
                    
                }
               
            }
            System.out.println();
        }

        
    }
}
