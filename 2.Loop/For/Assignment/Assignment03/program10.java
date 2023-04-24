

/*
 Program 10 : write a program to print the following pattern

	F 5 D 3 B 1
	F 5 D 3 B 1
	F 5 D 3 B 1
	F 5 D 3 B 1
	F 5 D 3 B 1
	F 5 D 3 B 1
 */


package For.Assignment.Assignment03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program10 {
    public static void main(String[] args)throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        for (int i = 1; i <= row; i++) {
            
            int num = row;
            char ch = (char)(64+row);
            for (int j = 1; j <= row; j++) 
            {
                if(j % 2==0)
                {   
                    System.out.print(num+" ");

                }
                else
                {
                    System.out.print( ch+ "  ");

                }
                ch--;
                num--; 
            }
            System.out.println();
        }
    }
    
}
