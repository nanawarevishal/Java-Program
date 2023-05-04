
/*
  Take N as input. Print all its factors
  Factors :
           x is a factor of N % x==0

 Input : 6
 Output : 1 2 3 6

 Input : 24
 Output : 1 2 3 4 8 12 24
 */

package ForLoop.ClassCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program4 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {

            if (N % i == 0) {
                System.out.print(i + " ");
            }

        
        }

    }
}
