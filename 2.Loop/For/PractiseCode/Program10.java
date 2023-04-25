
/*
 
*****
 ****
  ***
   **
    *

 */



package For.PractiseCode;

public class Program10 {
    public static void main(String[] args) {

        int row = 5;
        int sp=0;
        for(int i=1;i<=row;i++){

            for(int j = 1;j<=sp*2;j++){

                System.out.print(" ");
            }

            for(int k=row;k>=i;k--){

                System.out.print("* ");
            }
            sp++;
            System.out.println();
        }
    }
    
}
