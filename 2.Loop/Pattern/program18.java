
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

public class program18 {
    public static void main(String[] args) {

        int n=11;
        int sp=2;
        int g=1;

        for(int i=1;i<=n;i++){

            if(i<=(n/2+1)){
                for(int j=1;j<=i;j++){

                    System.out.print("* ");
                }
                System.out.println();
            }

            else{

                for(int k=n/2;k>=g;k--){
                    System.out.print("* ");
                    
                }
                
                for(int p=1;p<=sp;p++){
                    System.out.print(" ");
                }
                sp = sp+2;
                g++;

                System.out.println();
            }
        }
        
    }
}
