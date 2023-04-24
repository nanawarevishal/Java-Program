
/*
 Program 1 : write a program to print the following pattern
	C2W10
	C2W9 C2W8
	C2W7 C2W6 C2W5
	C2W4 C2W3 C2W2 C2W1
 */

package For.Assignment.Assignment05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program1 {
    public static void main(String[] args)throws Exception {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        int num = ((row*row+row)/2);

        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("C2W");
                System.out.print(num+" ");
                num--;
                
            }
            System.out.println();
        }
        
    }
}
