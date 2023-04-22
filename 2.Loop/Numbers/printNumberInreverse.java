
// Write the program to print all the even number in reverse order and all odd number in standard order

package Numbers;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class printNumberInreverse {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the start of range: ");
        int start = Integer.parseInt(br.readLine());

        System.out.println("Enter the end of range: ");
        int end = Integer.parseInt(br.readLine());

        System.out.println("The even numbers are: ");
        for(int i=end;i>=start;i--)
        {
            if(i % 2==0)
            {
                System.out.print(i+" ");
            }
        }

        System.out.println("\nThe odd numbers are: ");
        for(int i=start;i<=end;i++)
        {
            if(i % 2 !=0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
