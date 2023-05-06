
/*
 Take N as input. Print whether N is Armstrong number or not.

 Input : 23
 Output : Not an Armstrong number.


 Input: 153
 Output: Armstrong Number
 */

package ForLoop.ClassCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program13 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());

        int temp = num;
        int temp1 = num;

        int cnt = 0;
        while (temp != 0) {
            cnt++;
            temp /= 10;
        }

        int armstrong = 0;
        while (temp1 != 0) {
            int rem = temp1 % 10;

            int pow = 1;
            for(int i=1;i<=cnt;i++){
                pow =pow *rem;
            }
            armstrong += pow;
            temp1 /= 10;

        }

        if (armstrong == num) {
            System.out.println(num + " is a armostrong Number.");
        } else {
            System.out.println(num + " is not a armostrong Number.");
        }
    }
}
