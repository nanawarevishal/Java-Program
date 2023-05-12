

/*
 write a program to print the following pattern
A B C D
B C D
C D
D
 */


package NestedLoop.Assignment.Assignment04;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program5 {
    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        for(int i=1;i<=row;i++){
            
            char ch = (char)(64+i);
            for(int j=1;j<=(row-i+1);j++){

                System.out.print(ch+++" ");
            }
            System.out.println();
        }

    }
}
