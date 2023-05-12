
/*

 write a program to print the following pattern
        1
        8 9
        9 64 25
        64 25 216 49

 */

package NestedLoop.Assignment.Assignment04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program10 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        int num = 1;

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) {

                if(num%2==0){
                    System.out.print(num*num*num+" ");
                }
                else{
                    System.out.print(num*num+" ");
                }
                num++;

            }
            num = num-i+1;
            System.out.println();
        }

    }
}
