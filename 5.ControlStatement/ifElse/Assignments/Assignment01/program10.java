
/*
    Program 10: Write a unique real-time example of If ElseIf Else Ladder
 */

package Assignment01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program10 {
    public static void main(String[] args)throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Moner: ");
        float money = Float.parseFloat(br.readLine());


        if (money <= 0.00f) {
            System.out.println("Don't Go Anywhere keep starving");
        } 
        else if (money >= 700.00f) {
            System.out.println("party at Barbeque Nation");
        } 
        else if (money >= 5000.00f) {
            System.out.println("Dine in 5 star");
        } 
        else {
            System.out.println("monthly mess");
        }
    }

}
