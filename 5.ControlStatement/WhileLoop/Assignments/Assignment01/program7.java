

/*
        Program 7: Write a program which take’s number from user’s if number is even
        print that number in reverse order or if number is odd print that number in
        reverse order by difference two?
        Input:6
        output:6 5 4 3 2 1
        Input:7
        output:7 5 3 1.
 */

package WhileLoop.Assignments.Assignment01;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program7 {
    public static void main(String[] args)throws Exception {

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        if(num%2==0){
            while(num >=1){
                System.out.print(num+" ");
                num--;
            }

        }

        else{
            while(num >=1){
                System.out.print(num+" ");
                num = num-2;
            }

        }
    }

}
