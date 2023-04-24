
/*
 Program 4 : write a program to print the following pattern
	3C 3C 3C 3C
	3C 3C 3C
	3C 3C
	3C
 */


package For.Assignment.Assignment04;

import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows: ");
            int row = sc.nextInt();

            int count = row;
            for(int i=1;i<=row;i++)
            {
                System.out.print("3C ");

                if(i==count)
                {
                    i=0;
                    count--;
                    System.out.println();
                }
                if(count==0)
                {
                    break;
                }
            }
        }
    }
}
