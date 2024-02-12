
/*
 * 1
 * 2 9 
 * 3 8 10
 * 4 7 11 14
 * 5 6 12 13 15
 * 
 */



package Pattern;

public class program36 {
    public static void main(String[] args) {
        
        String str = "1121";
        int x = Integer.parseInt(str);
        int count = 1;
        for(int i=0;i<5;i++){

            for(int j=0;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
