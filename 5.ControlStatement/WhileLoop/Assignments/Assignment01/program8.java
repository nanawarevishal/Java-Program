
/*
        Program 8: Write a program to print the countdown of days to submit the
        assignment
        Input : day = 7
        Output: 7 days remaining
        6 days remaining

        5 days remaining
        .
        .
        1 days remaining
        0 days Assignment is Overdue
 */



package WhileLoop.Assignments.Assignment01;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program8 {
    public static void main(String[] args)throws Exception {

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of days : ");
        int num = Integer.parseInt(br.readLine());

        while(num>=0){
            
            if(num==0){
                System.out.print(num+" days Assignment is overdue.");
            }
            else{
                System.out.print(num+" days remaining.");
            }
            num--;
            
            System.out.println();
        }

    }
}
