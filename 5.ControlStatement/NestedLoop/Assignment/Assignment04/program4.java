
/*
 write a program to print the following pattern
1 2 3 4
2 3 4
3 4
4
 */


package NestedLoop.Assignment.Assignment04;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program4 {
    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        for(int i=1;i<=row;i++){
            
            int num=i;
            for(int j=1;j<=(row-i+1);j++){

                System.out.print(num+++" ");
            }
            System.out.println();
        }

    }
}