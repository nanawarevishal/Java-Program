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

public class program19 {
    public static void main(String[] args) {

        int row = 9;
        int sp=2;
        int g=1;

        for(int i=1;i<=row;i++){

            if(i<=(row/2+1)){

                for(int j=1;j<=2*(row-i);j++){
                    System.out.print(" ");
                }

                for(int k=1;k<=i;k++){
                    System.out.print("* ");
                }

                System.out.println();
            }

            else{

                for(int p=1;p<=sp;p++){

                    System.out.print(" ");
                }

                for(int q=row/2;q>=g;q--){
                    System.out.print("* ");
                }

                g++;
                sp = sp+2;
                System.out.println();
            }
            
        }
        
    }
}
