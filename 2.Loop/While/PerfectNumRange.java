package While;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PerfectNumRange {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the starting of the number: ");
        int start = Integer.parseInt(br.readLine());

        System.out.println("Enter the ending of the number: ");
        int end = Integer.parseInt(br.readLine());

        System.out.println("The Perfect number between " + start + " and " + end + " are: ");

        int sum;
        while (start <= end) {
            int i = 1;
            sum = 0;
            while (i < start) {
                if (start % i == 0) {
                    sum += i;
                }
                i++;
            }
            if (start == sum) {
                System.out.println(start + " ");
            }
            start++;
        }
    }
}
