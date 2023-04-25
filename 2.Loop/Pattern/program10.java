
/*
 * A 1 B 2
 * C 3 D
 * E 4
 * F
 */

package Pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program10 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        int num = 1;
        char ch = (char) (64 + num);
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= (row - i + 1); j++) {
                if (j % 2 == 0) {
                    System.out.print(num + " ");
                    num++;
                }

                else {
                    System.out.print(ch + " ");
                    ch++;
                }
            }
            System.out.println();
        }
    }
}
