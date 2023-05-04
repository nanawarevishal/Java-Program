
/*
        *****
         ****
          ***
           **
            *
 */




package Pattern;

public class program23 {
    public static void main(String[] args) {

        int row=7;
        int sp=0;

        for(int i=1;i<=row;i++){

            for(int k=1;k<=sp;k++){
                System.out.print(" ");

            }

            for(int j=row;j>=i;j--){
                System.out.print("* ");
            }
            sp = sp+2;

            System.out.println();
        }
        
    }
}
