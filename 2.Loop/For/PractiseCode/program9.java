
/*
 
 * * * * * 
  * * * * 
   * * * 
    * * 
     * 



 */


package For.PractiseCode;

public class program9 {
    public static void main(String[] args) {

        int num =5;
        int sp = 0;
        for(int i=1;i<=num;i++){

            for(int k=1;k<=sp;k++){
                System.out.print(" ");
            }

            for(int j=num;j>=i;j--){
                System.out.print("* ");
            }
            sp++;            
            System.out.println();
        }
        
    }

    
    
    
}
