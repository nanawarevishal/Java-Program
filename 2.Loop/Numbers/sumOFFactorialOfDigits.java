package Numbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sumOFFactorialOfDigits {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        int temp = num;
        int sum = 0;

        while(temp!=0)
        {
            int fact =1;
            int rem = temp % 10;

            for(int i=1;i<=rem;i++)
            {
                fact = fact * i;

            }

            sum += fact;
            temp = temp /10;
        }

        System.out.println("The sum of factorial of the digits of number: "+sum);
    }
}
