
/*
  Take N as input. Print its factorial.
  Input : 5
  Output : 120

  Input : 4
  Output : 24
 */

package ForLoop.ClassCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program3 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int N = Integer.parseInt(br.readLine());

        int fact = 1;

        for (int i = 1; i <= N; i++) {
            fact = fact * i;
        }

        System.out.println(fact);
    }
}
