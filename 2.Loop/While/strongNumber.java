package While;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class strongNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int rem = temp % 10;
            int fact = 1;

            while (rem >= 1) {
                fact *= rem;
                rem--;
            }
            temp /= 10;
            sum += fact;
        }

        if (sum == num) {
            System.out.println("The given number " + num + " is a strong number: ");
        }

        else {
            System.out.println("The given number " + num + " is not a strong number: ");
        }
    }

}
