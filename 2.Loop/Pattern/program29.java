package Pattern;

public class program29 {
    public static void main(String[] args) {
        
        int row = 5;

        for(int i=0;i<=row;i++){

            for(int j=0;j<=4;j++){

                if(i%2==0 && j%2==0){
                    System.out.print("* ");
                }

                else if(i%2==1 && j%2==1){
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
