
/*
 write a program to print the following pattern
10
10 9
9 8 7
7 6 5 4
 */


package NestedLoop.Assignment.Assignment04;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program3 {
    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        int num=10;
        for(int i=1;i<=row;i++){
            
            for(int j=1;j<=i;j++){

                System.out.print(num--+" ");
            }
            num++;
            System.out.println();
        }

    }
}