/*
Program 1 : write a program to print the following pattern
C2W
C2W C2W
C2W C2W C2W
	C2W C2W C2W C2W
 */

package For.Assignment.Assignment04;

import java.util.Scanner;

class program1{

    public static void main(String[] args) {

        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Enter the Number of Rows : ");
            int row = obj.nextInt();

            for (int i = 1; i <= row; i++) {
                for(int j=1;j<=i;j++)
                {
                    System.out.print("C2W ");
                }
                System.out.println();

               
            }
        }
    }
}