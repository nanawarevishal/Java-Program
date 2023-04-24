
/*
 Program 6 : write a program to print the following pattern
	9
	9 8
	9 8 7
	9 8 7 6
 */


package For.Assignment.Assignment04;

import java.util.Scanner;
class program6{
 
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
           System.out.println("Enter the Numbers of rows : ");
            int row = obj.nextInt();

            int count = 1;
            int num = 9;
            for (int i = 1; i <= row; i++) {

                System.out.print(num + " ");
                num--;

                if (i == count) {
                    i = 0;
                    num=9;
                    count++;
                    System.out.println();
                }
                if (count - 1 == row) {

                    break;
                }

            }
       }
    }
}