/*
Q1
Write a program to print the numbers divisible by 5 from 1 to 50 & the number is even also print the count of even numbers.

Input: Enter a lower limit: 1 Enter upper limit: 50

Output: 10, 20, 30, 40, 50
Count = 5

 */


package For.Assignment.Assignment06;

public class program1 {
    public static void main(String[] args) {

        int count = 0;
        System.out.print("Output: ");
        for(int i=1;i<=50;i++)
        {
            if(i % 5==0 && i % 2==0 )
            {
                System.out.print(i+" ");
                count++;
            }
        
        }

        System.out.println("\nCount: "+count);
        
    }
}
