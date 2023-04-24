
/*
 Program 3 : write a program to print the following pattern
		5 4 3 2 1
		8 6 4 2
		9 6 3
		8 4
		5

		USE THIS FOR LOOP STRICTLY for the outer loop
		Int row;
		Take the number of rows from user
		for(int i =1;i<=row;i++){

		}
 */

package For.Assignment.Assignment07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program2 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        int num = row;
        int num1 =num;
        for(int i=1;i<=row;i++)
        {
            num1  = num * i;
            for(int j=row;j>=i;j--)
            {
                System.out.print(num1+" ");
                num1-=i;
            }
            num--;
            System.out.println();
        }
    }
    
}
