package Numbers;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseNumber {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        int temp=num;
        int sum = 0;
        while(temp!=0)
        {
            int rem = temp % 10;

            sum = sum * 10 + rem;

            temp /=10;

        }

        System.out.println("The reverse number is: "+sum);
    }
}
