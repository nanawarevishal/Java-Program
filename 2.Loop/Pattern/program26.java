

/*


*               * 
* *           * * 
* * *       * * * 
* * * *   * * * * 
* * * * * * * * * 


 */



package Pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program26 {
    public static void main(String[] args)throws Exception {

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= 2 * row - 1; j++) {

                if (i == j || i + j == 2 * row || i == row || j==1 || j==2*row-1 ||(j<=i) || i+j>=2*row ) {
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
