
/*
        Q10
        Write a program to take range as input from the user and print Armstrong numbers. 
        ( Take a start and end number from a user )

        Input: Enter start: 1
        Enter end: 1650

        Output: Armstrong numbers between 1 and 1650 1 2 3 4 5 6 7 8 9 153 370 371 407 1634

 */

package For.Assignment.Assignment06;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program10 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the starting of the number: ");
        int start = Integer.parseInt(br.readLine());

        System.out.println("Enter the ending of the number: ");
        int end = Integer.parseInt(br.readLine());

        System.out.print("Output: Amstrong numbers between "+start+" and "+end+" are:");

        for(int i=start;i<=end;i++)
        {
            int temp =i;
            int temp1 =i;
            int sumCube =0;
            int cnt=0;

            while(temp1 !=0)
            {
                cnt++;
                temp1 /=10;

            }

            // while(temp !=0)
            // {
            //     int rem = temp % 10;
            //     sumCube  = (int) (sumCube +Math.pow(rem, cnt));
            //     temp /=10;
            // }

            while(temp !=0)
            {
                int rem = temp % 10;
                int mul = 1;
                int cnt1 =cnt;
                while(cnt1>0)
                {
                    mul *=rem;
                    cnt1--;
                }

                sumCube +=mul;
                temp /=10;
            }

            if(sumCube == i)
            {
                System.out.print(i+" ");
            }
        }
    
    } 
}
