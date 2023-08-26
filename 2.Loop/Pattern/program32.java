package Pattern;

public class program32 {
    
    public static void main(String[] args) {
        
        int row = 5;
        int q = 1;

        for(int i=1;i<=row;i++){

            if(i<=row/2+1){
                
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }

                System.out.println();
            }
            else{

                for(int p = row/2;p>=q;p--){
                    System.out.print("* ");
                }
                q++;

                System.out.println();
            }
        }
    }
}
