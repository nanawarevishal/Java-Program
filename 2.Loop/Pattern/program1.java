package Pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Print the pattern
/*
 *      $
 *      @  @
 *      &  &  &
 *      #  #  #  #
 *      $  $  $  $  $
 *      @  @  @  @  @  @
 *      &  &  &  &  &  &  &
 *      #  #  #  #  #  #  #  #
 */

public class program1 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 4 == 0) {
                    System.out.print("# ");
                }

                else if (i % 2 == 0) {
                    System.out.print("@ ");
                }

                else if (i % 3 == 0) {
                    System.out.print("& ");
                }

                else {
                    System.out.print("$ ");
                }
            }
            System.out.println();
        }
    }
}
