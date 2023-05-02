
/*
        Program 5: Write a program to print the square of even digits of the
        given number.
        Input: 942111423
        Output: 4 16 4 16
 */



package WhileLoop.Assignments.Assignment01;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program5 {
    public static void main(String[] args)throws Exception {

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        while(num !=0){

            int rem = num %10;

            if(rem %2==0){
                System.out.print(rem*rem+" ");
            }

            num/=10;
        }
    }
}
