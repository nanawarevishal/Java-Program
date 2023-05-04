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




package Pattern;

public class program22 {

    public static void main(String[] args) {
        
        int row = 5;

        int col = 0;
        int sp=0;

        for(int i=1;i<=2*row-1;i++){

            if(i<=row){
                col = i+(i-1);
                sp = 2*(row-i);
            }

            else{
                col = col-2;
                sp = 2*(i-row);
            }

            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=col;k++){
                System.out.print("* ");
            }

            System.out.println();


        }
    }
    
}
