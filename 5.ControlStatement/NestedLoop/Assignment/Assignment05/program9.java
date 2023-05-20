
/*
        Q9
        Write a program to take a number as input and print the Addition of Factorials of each digit
        from that number.
        Input: 1234
        Output: Addition of factorials of each digit from 1234 = 33

 */




package NestedLoop.Assignment.Assignment05;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program9 {
    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");

        int num = Integer.parseInt(br.readLine());

        int temp =num;
        int sum=0;
        while(temp!=0){
            int fact=1;
            int rem = temp%10;

            for(int i=1;i<=rem;i++){
                fact = fact*i;
            }
            temp /=10;

            sum +=fact;
        }

        System.out.println("Addition of factorials of each digit from "+num+" : "+sum);
    }
}
