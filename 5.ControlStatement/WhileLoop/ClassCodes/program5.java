
// Given an integer N
// Print all its digit

// Input :6531
// Output: 1 3 5 6


package WhileLoop.ClassCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program5 {
    public static void main(String[] args)throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        while(num!=0){

            int rem = num % 10;
            System.out.print(rem+" ");
            num /=10;
        }
        
    }
}
