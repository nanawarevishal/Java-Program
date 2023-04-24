
/*
 Program 8 : write a program to print the following pattern
	J
	I H
	G F E
	D C B A
 */




package For.Assignment.Assignment04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program8 {
    public static void main(String[] args)throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows: ");
        int row  = Integer.parseInt(br.readLine());

        
        char ch = (char) (65 + ((row * row) + 2) / 2);
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch--;
            }

            System.out.println();
        }
    }
    
}
