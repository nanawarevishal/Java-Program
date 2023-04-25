
/*
           
           *
	     * * *
       * * * * *
     * * * * * * *
   * * * * * * * * *
	 
 */

package For.PractiseCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program13 {
    public static void main(String[] args)throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        for (int i = 1; i <= row; i++) {

            for (int j = 2*(row-i); j >=1 ; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i + (i - 1); k++) {
                System.out.print("* ");
            }

            System.out.println();

        }

    }

}
