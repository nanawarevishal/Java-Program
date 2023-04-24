
/*
 Program 7 : write a program to print the following pattern
	F
	E F
	D E F
	C D E F
	B C D E F
	A B C D E F
 */

 package For.Assignment.Assignment04;

 import java.util.Scanner;
 class program7{
  
     public static void main(String[] args) {
         try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Enter the Numbers of rows : ");
             int row = obj.nextInt();
 
             int count = 1;
             char ch = 'F';
             for (int i = 1; i <= row; i++) {
                 
                 char ch1 =ch;
                 System.out.print(ch1 + " ");
                 ch1++;
 
                 if (i == count) {
                     i = 0;
                     ch -=1;
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