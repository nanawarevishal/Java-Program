
/*
  Program 9 : Write a program to take a number as input and print the Addition of Factorials of each
	      digit from that number.
	      Input: 1234
	      Output: Addition of factorials of each digit from 1234 = 33 
 */

package For.Assignment.Assignment07;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program9 {
    public static void main(String[] args)throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Number : ");
		int num = Integer.parseInt(br.readLine());

        int temp = num;
        int sum =0;
        while(num!=0)
        {
            int rem = num % 10;
            int fact =1;
            for(int i=1;i<=rem;i++)
            {
                fact = fact * i;
            }
            sum +=fact;
            num /=10;
        }

        System.out.println("Addition of factorials of each digit from "+temp+" is "+sum);
        
    }
    
    
}
