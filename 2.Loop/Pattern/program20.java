
/*
           * 
         * * 
       * * * 
     * * * * 
   * * * * * 


 */


package Pattern;

public class program20 {
   public static void main(String[] args) {

        int row=5;

        for(int i=1;i<=row;i++){
            for(int j=1;j<=2*(row-i);j++){

                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }

            System.out.println();
        }
    
   } 
}
