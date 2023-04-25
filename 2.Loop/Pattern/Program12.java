
/*
 *  1 
 *  4 3
 *  16 5 36
 *  49 8 81 10
 */

package Pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program12 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        int num = 1;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 != 0) {
                    System.out.print(num * num + " ");

                } else {
                    System.out.print(num + " ");

                }
                num++;
            }
            System.out.println();
        }
    }

}
