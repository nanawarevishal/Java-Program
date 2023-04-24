
/*
        Q6
        Write a program to take 5 numbers as input from the user and print the count of digits in those numbers.

        Input: Enter 5 numbers :
        5
        The digit count in 5 is 1

        25
        The digit count in 25 is 2 225
        The digit count in 225 is 3

        6548
        The digit count in 6548 is 4

        852347
        The digit count in 852347 is 6

 */

package For.Assignment.Assignment06;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program6 {
    public static void main(String[] args)throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the no of number:");
        int num1 = Integer.parseInt(bf.readLine());

        for(int i=1;i<=num1;i++)
        {
            System.out.println("Enter the no of number:");
            int num = Integer.parseInt(bf.readLine());

            int temp = num;
            int cnt =0;

            while(temp !=0)
            {
                cnt++;
                temp /=10;
            }
            System.out.println("The digit count in "+num +" is "+cnt);

        }

    }
}
