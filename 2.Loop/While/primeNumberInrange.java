package While;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class primeNumberInrange {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first number: ");
        int start = Integer.parseInt(br.readLine());

        System.out.println("Enter the second number: ");
        int end = Integer.parseInt(br.readLine());

        System.out.println("The prime number between " + start + " and " + end + " are:");
        while (start <= end) {
            int i = 1;
            int cnt = 0;
            while (i <= start) {
                if (start % i == 0) {
                    cnt++;
                }

                if (cnt > 2) {
                    break;
                }
                i++;
            }

            if (cnt == 2) {
                System.out.print(start + " ");
            }
            start++;
        }
    }
}
