
/*
        Q4
        Write a program to take a range as input from the user and print perfect cubes between that range.

        Input: Enter start: 1
        Enter end: 100

        Output: perfect cubes between 1 and 100
—--------------------------

 * 
 * 
 * 
 */

package For.Assignment.Assignment06;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program4 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the starting of the number: ");
        int start = Integer.parseInt(br.readLine());

        System.out.println("Enter the ending of the number: ");
        int end = Integer.parseInt(br.readLine());

        System.out.print("Output: The perfect squares between "+start+" and "+end+" are:");

        while(start <=end)
        {
            if((start*start*start) <=end)
            {
                System.out.print((start*start*start)+" ");
            }
            start++;
        }

        // Alternative

        // for(int i=start;i<=end;i++)
        // {
        //     if((i*i*i)<=end)
        //     {
        //         System.out.print((i*i*i)+" ");
        //     }
        // }
    }
    
}
