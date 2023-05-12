/*
 write a program to print the following pattern
1
3 4
6 7 8
10 11 12 13
15 16 17 18 19
 */


package NestedLoop.Assignment.Assignment04;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program2 {
    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        int num=1;
        for(int i=1;i<=row;i++){

            for(int j=1;j<=i;j++){

                System.out.print(num+++" ");
            }
            num++;
            System.out.println();
        }

    }
}
