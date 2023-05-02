/*
 Take an integer N as input
 print mulitples of 4 till N
 */

package WhileLoop.ClassCodes;

public class program4 {
    public static void main(String[] args) {
        
        int n=45;

        int i=4;

        while(i<=45){
            System.out.print(i+" ");

            i+=4;
        }

        System.out.println();
        int x=4;
        while(x<=n){

            if(x%4==0){
                System.out.print(x+" ");
            }
            x++;
        }
    }
}
