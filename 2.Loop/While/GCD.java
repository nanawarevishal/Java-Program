package While;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GCD {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first number");
        int num1 = Integer.parseInt(bf.readLine());

        System.out.println("Enter the seccond number: ");
        int num2 = Integer.parseInt(bf.readLine());

        int i = 1;
        int comn = 0;
        while (i <= num1 || i <= num2) {
            if (num1 % i == 0 && num2 % i == 0) {
                comn = i;
            }
            i++;
        }
        System.out.println("The Greatest common divisor between " + num1 + " and " + num2 + " is: " + comn);

    }
}
