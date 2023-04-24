
/*
 Program 3 : write a program to print the following pattern
	10
	9 8 
	7 6 5
	4 3 2 1
 */


package For.Assignment.Assignment04;

import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Enter the Number of Rows : ");
            int row = obj.nextInt();

            int num = 10;
            for (int i = 1; i <= row; i++) {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(num+" ");
                    num--;

                }
                System.out.println();

               
            }
        }
    }

    
}
