
/*
        Q9
        write a program to print a series of strong numbers from entered range. ( Take a start and end number from a user )

        Input:-
        Enter starting number: 1 Enter ending number: 150

        Output:-
        Output: strong numbers between 1 and 150 1	2	145
 */




package For.Assignment.Assignment06;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program9 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the starting of the number: ");
        int start = Integer.parseInt(br.readLine());

        System.out.println("Enter the ending of the number: ");
        int end = Integer.parseInt(br.readLine());

        System.out.print("Output: Strong numbers between "+start+" and "+end+" are:");

        for(int i=start;i<=end;i++)
        {
            int temp =i;
            int sum = 0;

            while(temp!=0)
            {
                int rem = temp % 10;
                int fact =1;
                while(rem >=1)
                {
                    fact = fact * rem;
                    rem--;
                }

                sum +=fact;
                temp /=10;

            }

            if(sum==i)
            {
                System.out.print(i+" ");
            }
        }


    }
    
}
