
/*
 *  10
 *  9 8
 *  7 6 5
 *  4 3 2 1
 */

 package Pattern;
 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 
 public class program16 {
 
     public static void main(String[] args)throws Exception {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
         System.out.println("Enter the the number of rows: ");
         int row = Integer.parseInt(br.readLine());
 
         int num = 10;
 
         for(int i=1;i<=row;i++)
         {
             for(int j=1;j<=i;j++)
             {
                 System.out.print(num+" ");
                 num--;
             }
             System.out.println();
         }
     } 
 }
 