
/*
 *  1
 *  1 2
 *  1 2 3
 *  1 2 3 4
 */

 package Pattern;
 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 
 public class program17 {
 
     public static void main(String[] args)throws Exception {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
         System.out.println("Enter the the number of rows: ");
         int row = Integer.parseInt(br.readLine());
 
         
         for(int i=1;i<=row;i++)
         {
             int num = 1;
             for(int j=1;j<=i;j++)
             {
                 System.out.print(num+" ");
                 num++;
             }
             System.out.println();
         }
     } 
 }
 