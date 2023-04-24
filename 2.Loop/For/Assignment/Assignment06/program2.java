
/*
Q2
Write a program to take range as input from the user and print composite numbers. Input: Enter start: 1
Enter end: 20

Output: composite numbers between 1 and 20 4 6 8 9 10 12 14 15 16 18 20

 */



package For.Assignment.Assignment06;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program2 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the starting of the number: ");
        int start = Integer.parseInt(br.readLine());

        System.out.println("Enter the ending of the number: ");
        int end = Integer.parseInt(br.readLine());

        System.out.print("Output: composite numbers between "+start+" and "+end+" are:");
        for(int i=start;i<=end;i++)
        {
            int cnt=0;
            for(int j=1;j<=i;j++)
            {
                if(i % j==0)
                {
                    cnt++;
                }

                if(cnt > 2)
                {
                    System.out.print(i+" ");
                    break;
                }
            }
        }

        
    }
}
