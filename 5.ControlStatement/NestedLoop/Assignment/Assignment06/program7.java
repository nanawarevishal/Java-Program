
/*
        Q7
        Write a program to take range as input from the user and print the reverse of all numbers. ( Take a
        start and end number from a user )
        Input: Enter start: 100
        Enter end: 200
        Output: Palindrome numbers between 100 and 250
 */




package NestedLoop.Assignment.Assignment06;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program7 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the start and end: ");

        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        for (int i = start; i <= end; i++) {

            int temp = i;
            int sum = 0;

            while(temp!=0){
                int rem = temp%10;

                sum  = sum*10+rem;
                temp/=10;
            }

                System.out.print(sum + " ");
        }
    }
}
