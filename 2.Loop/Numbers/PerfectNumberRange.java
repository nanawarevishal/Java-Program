package Numbers;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PerfectNumberRange {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the starting of the number: ");
        int start = Integer.parseInt(br.readLine());

        System.out.println("Enter the ending of the number: ");
        int end = Integer.parseInt(br.readLine());

        System.out.println("The Perfect number between " + start + " and " + end + " are: ");

        for(int i=start;i<=end;i++)
        {
            int sum = 0;
            for(int j=1;j<i;j++)
            {
                if(i % j==0)
                {
                    sum = sum + j;
                }

            }

            if(sum==i)
            {
                System.out.print(i+" ");
            }
        }
    }
}
