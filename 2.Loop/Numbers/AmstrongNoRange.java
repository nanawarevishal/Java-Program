package Numbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AmstrongNoRange {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the starting of the number: ");
        int start = Integer.parseInt(br.readLine());

        System.out.println("Enter the ending of the number: ");
        int end = Integer.parseInt(br.readLine());

        System.out.println("The Amstrong number between " + start + " and " + end + " are: ");
        for (int i = start; i <= end; i++) {
            int num = i;
            int sum = 0;

            int num1=i;

            int cnt=0;
            while(num1 !=0){
                cnt++;
                num1 /=10;
            }

            while (num != 0) {
                int rem = num % 10;
                sum += Math.pow(rem, cnt);
                num /= 10;

            }

            if (sum == i) {
                System.out.print(i + " ");
            }

        }

    }
}
