package Numbers;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class primenumber {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the starting of the prime number: ");
        int start = Integer.parseInt(br.readLine());

        System.out.println("Enter the ending of the prime number: ");
        int end = Integer.parseInt(br.readLine());

        if(start==1 && end ==1)
        {
            System.out.println(start+" It is not the prime number");
        }

        else
        {

            System.out.println("The prime numbers between "+start+" and "+end+" are:");
            for(int i=start;i<=end;i++)
            {
                int cnt =0;
                for(int j=1;j<=i;j++)
                {
                    if(i % j==0)
                    {
                        cnt++;

                    }

                    if(cnt > 2)
                    {
                        break;
                    }

                }

                if(cnt==2)
                {
                    System.out.print(i+" ");
                }
            }
        }
    }
}
