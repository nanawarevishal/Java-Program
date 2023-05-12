
/*
 write a program to print the following pattern
1 2 3 4
4 5 6
6 7
7
 */


package NestedLoop.Assignment.Assignment03;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program10 {
    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        int num=1;
        for(int i=1;i<=row;i++){

            for(int j=1;j<=(row-i+1);j++){
                System.out.print(num+" ");
                
                num++;
            }
            num--;
            System.out.println();
        }
    }

}
