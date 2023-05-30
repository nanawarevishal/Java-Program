package ClassCodeArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program5 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a[] = new int[5];

        System.out.println("Enter the  number: ");
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = Integer.parseInt(br.readLine());
            sum +=a[i];
        }
        
        System.out.println("The sum of the numbers of array : ");
        System.out.println("Sum: " + sum);
    }
}
