
/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *




 */


package For.PractiseCode;

public class Program11 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++)
        {
            if(i<=5)
            {
                for(int j=2*(5-i);j>=1;j--){
                    System.out.print(" ");
                }
                
                for(int k=1;k<=i;k++){
                    System.out.print("* ");
                }
    
                System.out.println();

            }

            else
            {

            }

           
        }
    }
    
}
