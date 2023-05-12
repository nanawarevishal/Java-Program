
/*

 write a program to print the following pattern
        C2W
        C2W C2W
        C2W C2W C2W
        C2W C2W C2W C2W

 */

package NestedLoop.Assignment.Assignment03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program1 {
    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        for(int i=1;i<=row;i++){

            for(int j=1;j<=i;j++){

                System.out.print("C2W ");
            }
            System.out.println();
        }

    }
}
