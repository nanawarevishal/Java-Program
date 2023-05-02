
/*
            Program 4: Write a program to count the Odd digits of the given number.
            Input: 942111423
            Output: count of odd digits = 5
 */



 package ForLoop.Assignments.Assignment01;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program4 {
    public static void main(String[] args)throws Exception {

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        int cnt=0;
        while(num!=0){
            
            int rem = num %10;

            if(rem %2==1){

                cnt++;
            }
            num /=10;
        }

        System.out.print("Count of odd digits= "+cnt);
        
    }
}
