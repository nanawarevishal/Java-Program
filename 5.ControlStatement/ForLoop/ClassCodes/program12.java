package ForLoop.ClassCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program12 {
    public static void main(String[] args)throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num % i==0){
                sum +=i;
            }
        }

        if(sum==num){
            System.out.print(num+" is a perfect number.");
        }

        else{
            System.out.print(num+" is not a perfect number.");
        }

    }
}
