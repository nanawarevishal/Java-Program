
/*
 write a program to print the following pattern
1
2 3
3 4 5
4 5 6 7
 */


package NestedLoop.Assignment.Assignment04;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program6 {
    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        for(int i=1;i<=row;i++){
            
            int num=i;
            for(int j=1;j<=i;j++){

                System.out.print(num+++" ");
            }
            System.out.println();
        }

    }
}
