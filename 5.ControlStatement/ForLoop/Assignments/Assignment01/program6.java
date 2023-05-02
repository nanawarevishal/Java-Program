
/*
        Program 6: Write a program to print the sum of all even numbers and
        multiplication of odd numbers between 1 to 10.
        Output: sum of even numbers between 1 to 10 = 30
        Multiplication of odd numbers between 1 to 10 = 945

 */


 package ForLoop.Assignments.Assignment01;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program6 {
    public static void main(String[] args)throws Exception {

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        int sum=0;
        int mult=1;

        for(int i=1;i<=num;i++){

            if(i %2==0){
                sum +=i;
            }

            else{
                mult *=i;
            }
        }

        System.out.print("Sum of even numbers between 1 to 10 = "+sum);
        System.out.println();
        System.out.print("Multiplication of odd numbers between 1 to 10 = "+mult);
    }
}
