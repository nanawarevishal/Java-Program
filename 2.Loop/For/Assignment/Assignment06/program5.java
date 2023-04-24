
/*
        Q5
        Write a program to take range as input from the user and print perfect numbers.
        {Note: Perfect number is the one whose perfect divisor’s addition is equal to that number. 
         6 is perfect number = 1 + 2 + 3 = 6}

        Input: Enter start: 1
        Enter end: 30
        Output: perfect numbers between 1 and 30 6	28
        —--------------------------

 */


package For.Assignment.Assignment06;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program5 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the starting of the number: ");
        int start = Integer.parseInt(br.readLine());

        System.out.println("Enter the ending of the number: ");
        int end = Integer.parseInt(br.readLine());

        System.out.print("Output: The perfect numbers between "+start+" and "+end+" are:");


        for(int i=start;i<=end;i++)
        {
            int sum =0;
            for(int j=1;j<i;j++)
            {
                if(i % j ==0)
                {
                    sum +=j;
                }
            }

            if(sum==i)
            {
                System.out.print(i+" ");
            }
        }

        // Alternative

        // int sum;
        // while(start <= end)
        // {
        //     int i=1;
        //     sum=0;
        //     while(i<start)
        //     {
        //         if(start % i == 0)
        //         {
        //             sum += i;
        //         }
        //         i++;
        //     }
        //     if(start==sum)
        //     {
        //         System.out.print(start+" ");
        //     }
        //     start++;

        // }
    }

    
}
