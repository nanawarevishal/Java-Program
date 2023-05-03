
/*
           * 
         * * 
       * * * 
     * * * * 
   * * * * * 
     * * * *
       * * *
         * *
           *
           
 */




package Pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program21 {
    public static void main(String[] args)throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        int col=0;
        int sp=0;

        for(int i=1;i<=2*row-1;i++){

            if(i<=row){
                col=i;
                sp = 2*(row-i);
            }

            else{
                col = 2*row-i;
                sp = 2*(i-row);
            }

            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=col;k++){
                System.out.print("* ");
            }

            System.out.println();
        }
        
    }
}
