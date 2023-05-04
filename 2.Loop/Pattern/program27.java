


/*


*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * * * * * * * * 
              * * * * * * 
                * * * * * 
                  * * * * 
                    * * * 
                      * * 
                        * 

                        
 */


package Pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program27 {
    public static void main(String[] args)throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows: ");
        int row = Integer.parseInt(br.readLine());


        for(int i=1;i<=2*row-1;i++){

            for(int j=1;j<=2*row-1;j++){

                if(i==j || (j==1 && i<=row )|| i==row || (j==2*row-1 && i>row ||(j<=i && i<=row)) || (j>=i && i>row) ){

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
