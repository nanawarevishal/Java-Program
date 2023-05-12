
/*

 * * * * *
 * *   * *
     *
 * *   * *
 * * * * *
 
 */



 package Pattern;
 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 
 public class program31 {
     public static void main(String[] args)throws Exception {
 
         BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
 
         System.out.println("Enter the number of rows: ");
         int row = Integer.parseInt(br.readLine());
 
         for(int i=1;i<=row;i++){
 
             for(int j=1;j<=row;j++){
 
                if(i==j || i==1 || i==row || i+j==row+1 || ((i+j>row+1) && (i<(row/2+1)||(j>i && (i>row/2+1))))|| ((j<i) &&((i<row/2+1)||(i+j<row+1 && (i>row/2+1))))){
                    System.out.print("* ");
                }
                 else{
                     System.out.print("  ");
                 }
             }
             System.out.println();
         }
 
     }
 }
 