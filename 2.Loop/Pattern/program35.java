


/*
            * * * * * * *
              * * * * *
                * * *
                  *
                * * *
              * * * * *
            * * * * * * *
 */







package Pattern;

public class program35 {

    public static void main(String[] args) {
        
        int row = 4;
        int col = 7;
        int sp = 0;
        for(int i=1;i<=2*row-1;i++){

            if(i<row){

                for(int j=1;j<=sp;j++){
                    System.out.print(" ");
                }
                
                for(int k=1;k<=col;k++){
                    System.out.print("* ");
                }
                
                sp +=2;
                col-=2;
            }

            else{
                
               
                for(int j=1;j<=sp;j++){
                    System.out.print(" ");
                }
                
                for(int k=1;k<=col;k++){
                    System.out.print("* ");
                }

                col +=2;
                sp -=2;
                    
            }
            
            
            System.out.println();
        }
    }
}
