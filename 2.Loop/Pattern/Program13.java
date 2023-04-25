package Pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program13 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the the number of rows: ");
        int row = Integer.parseInt(br.readLine());
        int num = 1;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num * num + " ");
                num++;
            }
            System.out.println();

        }
    }
}
