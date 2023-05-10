package Pattern;

public class program28 {
    public static void main(String[] args) {
        
        int row=5;
        int y =row;
        int x = row;
        for(int i=1;i<=row;i++){

            x = y*i;
            for(int j=1;j<=(row-i+1);j++){
                System.out.print(x+" ");
                x=x-i;
            }
            System.out.println();
            y--;
        }
    }
}
