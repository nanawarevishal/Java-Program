/*
 * 1 4 3 16
 * 5 36 7
 * 8 81
 * 10
 */

package Pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program9 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        int num = 1;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= (row - i + 1); j++) {
                if (j % 2 != 0) {
                    System.out.print(num + " ");
                }

                else {
                    System.out.print(num * num + " ");
                }
                num++;
            }
            System.out.println();
        }
    }
}
