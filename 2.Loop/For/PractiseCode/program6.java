
/*
           * 
         * * 
       * * * 
     * * * * 
   * * * * * 

 */

package For.PractiseCode;

public class program6 {
    public static void main(String[] args) {
        int i, j, n = 5;
        for (i = 1; i <= n; i++) {

            for (j = 2 * (n - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
