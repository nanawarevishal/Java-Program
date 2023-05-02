
/*
        Program 9: Write a program to reverse the given number.
        Input: 942111423
        Output: 324111249
 */


 package ForLoop.Assignments.Assignment01;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program9 {
    public static void main(String[] args)throws Exception {

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number : ");
        int num = Integer.parseInt(br.readLine());

        int rev =0;

        while(num!=0){

            int rem = num %10;

            rev = rev *10+rem;
            num /=10;
        }

        System.out.print(rev);
    }
}
