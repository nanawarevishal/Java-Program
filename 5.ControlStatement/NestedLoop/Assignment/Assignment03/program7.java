
/*
 write a program to print the following pattern
F
E F
D E F
C D E F
B C D E F
A B C D E F
 */



package NestedLoop.Assignment.Assignment03;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program7 {
    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows: ");
        int row = Integer.parseInt(br.readLine());
 
        // Method 1

        char ch = (char)(64+row);
        for(int i=1;i<=row;i++){
            
            char ch1 = ch;
            for(int j=1;j<=i;j++){
                System.out.print(ch1+" ");
                ch1++;
            }

            ch--;
            System.out.println();
        }

        // Method 2 

        for(int i=1;i<=row;i++){
            
            char ch2 = (char)(65+row-i);
            for(int j=1;j<=i;j++){
                System.out.print(ch2+" ");
                ch2++;
            }


            System.out.println();
        }

        
    }

}
