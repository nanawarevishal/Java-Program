
/*
 		*  *  *  *  *  *  *
		   *           *
		      *     *
		         *           
 */


package Pattern;

public class program25 {

    public static void main(String[] args) {
        
        int row=4;
        int col = 2*row-1;
        int sp=0;

        for(int i=1;i<=row;i++){

            for(int k=1;k<=sp;k++){
                System.out.print(" ");
            }

            sp = sp+2;

            for(int j=1;j<=col;j++){

                if(i==j || i+j==2*row || i==1){

                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
  
            }

            System.out.println(); 
        }
    }
    
}
