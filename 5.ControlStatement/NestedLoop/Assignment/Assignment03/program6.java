
/*
 Q6
write a program to print the following pattern
9
9 8
9 8 7
9 8 7 6
 */



package NestedLoop.Assignment.Assignment03;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program6 {
    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        
        for(int i=1;i<=row;i++){
            
            int num=9;
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num--;
            }
            System.out.println();
        }
    }

}
