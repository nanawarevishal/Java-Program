
/*
 11. Sandglass Star Pattern
Enter the number of rows: 5

* * * * * 
 * * * * 
  * * * 
   * * 
    * 
    * 
   * * 
  * * * 
 * * * * 
* * * * * 

 */


package Pattern;

public class program24 {

    public static void main(String[] args) {

        int row=7;
        int sp=0;
        int col =0;

        for(int i=1;i<=2*row;i++){

            if(i<=row){
                col=row-i+1;
                sp = i-1;
            }

            else{

                col = i-row;
                sp = 2*row-i;
            }

            for(int k=1;k<=sp;k++){
                System.out.print(" ");
            }

            for(int j=1;j<=col;j++){
                System.out.print("* ");
            }

            System.out.println();


        }
    }
    
}
