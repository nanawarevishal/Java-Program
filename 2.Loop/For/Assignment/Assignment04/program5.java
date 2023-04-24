
/*
 Program 5 : write a program to print the following pattern
	10 10 10 10
	11 11 11
	12 12
	13
 */



 package For.Assignment.Assignment04;

 import java.util.Scanner;
 
 public class program5 {
     public static void main(String[] args) {
         
         try (Scanner sc = new Scanner(System.in)) {
             System.out.println("Enter the number of rows: ");
             int row = sc.nextInt();
            
             int num=10;
             int count = row;
             for(int i=1;i<=row;i++)
             {
                 System.out.print(num+" ");
                 
                 if(i==count)
                 {
                     i=0;
                     count--;
                     num++;
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
 