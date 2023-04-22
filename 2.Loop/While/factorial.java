package While;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class factorial {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        int i=1;
        int fact =1;
        while(i<=num)
        {
            fact *=i;
            i++;
        }
        System.out.println("The factorial of "+num+" is: "+fact);
        
    }
}
