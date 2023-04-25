/*
 
   * * * * * * * 
     * * * * * 
       * * * 
         *
 */



package For.PractiseCode;

public class Program14 {
    public static void main(String[] args) {

        int row = 4;
        int sp = 0;

        for(int i=1;i<=row;i++){

            for(int j=1;j<=sp;j++)
            {
                System.out.print(" ");
            }

            for(int k=2*row-2*i+1;k>=1;k--){
                System.out.print("* ");
            }
            sp = sp+2;
            System.out.println();
            
        }

        for(int i=1;i<=row;i++){

            for(int j=1;j<=2*i;j++)
            {
                System.out.print(" ");
            }

            for(int k=2*row-2*i+1;k>=1;k--){
                System.out.print("* ");
            }
            sp = sp+2;
            System.out.println();
            
        }
        
        
    }
}
