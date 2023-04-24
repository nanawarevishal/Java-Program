/*
        Q7
        Write a program to take range as input from the user and print the reverse of all numbers. ( Take a start and end number from a user )

        Input: Enter start: 100
        Enter end: 200

        Output: Palindrome numbers between 100 and 250
—------------------------------------------------------

 */


package For.Assignment.Assignment06;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program8 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the starting of the number: ");
        int start = Integer.parseInt(br.readLine());

        System.out.println("Enter the ending of the number: ");
        int end = Integer.parseInt(br.readLine());

        System.out.print("Output: Palindrome numbers between "+start+" and "+end+" are:");

        for(int i=start;i<=end;i++)
        {
            int temp = i;
            int rev =0;

            while(temp !=0)
            {
                int rem = temp % 10;
                rev = rev * 10 + rem;

                temp /=10;
            }

            if(rev == i)
            {
                System.out.print(i+" ");
            }
        }
    }
    
}
