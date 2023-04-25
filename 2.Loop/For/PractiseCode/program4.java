

/*
               A 
              A B 
             A B C 
            A B C D 
           A B C D E 
          A B C D E F
 */

package For.PractiseCode;

public class program4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            int num = 64;

            for (int j = 6; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print((char) (num + k) + " ");
            }
            System.out.println();

        }
    }
}
