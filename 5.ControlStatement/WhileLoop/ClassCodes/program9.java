
/*
  Take an integer N as input
  print perfect square till N.
  Perfect Square : An integer whose square root is a integer.

  25-5: yes
  81-9 : yes
  1-> :yes


  input :30
  output:1 4 6 16 25

 */



package WhileLoop.ClassCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program9 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        int temp =1;

        int i=1;

        while(i*i<=num){
            System.out.print(i*i+" ");
            i++;
        }


        // Second Approach
        System.out.println();

        while(temp <=num){

            if(temp * temp <=num){
                System.out.print(temp*temp+" ");
            }
            temp++;
        }

    }
}
