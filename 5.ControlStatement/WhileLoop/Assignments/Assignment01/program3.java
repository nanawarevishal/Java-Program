
/*
        Program 3: Write a program to count the digits of the given number.
        Input: 942111423
        Output: count of digits = 9
 */


package WhileLoop.Assignments.Assignment01;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program3 {
    public static void main(String[] args)throws Exception {

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        int temp=num;
        int cnt=0;

        while(temp!=0){

            temp /=10;
            cnt++;

        }

        System.out.println("Count of digit= "+cnt);
    }
}
