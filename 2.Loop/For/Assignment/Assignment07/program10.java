
/*
 Program 10 : write a program to print a series of prime numbers from entered range. ( Take a start and end number
	      from a user )
              Perform dry run at least from 10 to 20 ...
		Input:-
			Enter starting number: 10
			Enter ending number: 100
		Output:-
			Series = 11 13 17 19 ..... 89 97
 */

package For.Assignment.Assignment07;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program10 {
    public static void main(String[] args)throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the start and end Number : ");
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());

        System.out.print("Output: Prime numbers between "+start+" and "+end+" are:");

        for(int i=start;i<=end;i++)
        {
            int cnt=0;
            for(int j=1;j<=i;j++)
            {
                if(i % j==0)
                {
                    cnt++;
                }
                
                if(cnt>2)
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
