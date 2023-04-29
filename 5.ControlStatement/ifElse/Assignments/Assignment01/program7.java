/*
 
    Program 7: Calculate profit or loss.
    Write a program that takes the cost price and selling price (take it hardcoded) and
    calculates its profit or loss
    input1:
    sellingPrice = 1200
    costPrice = 1000
    Output: profit of 200
    input2:
    sellingPrice = 300
    costPrice = 500
    Output: loss of 200
    input3:
    sellingPrice = 900
    costPrice = 900
    Output: ???

 */

package Assignment01;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program7 {

    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Selling Price: ");
        int sp = Integer.parseInt(br.readLine());

        System.out.println("Enter the Cost Price: ");
        int cp = Integer.parseInt(br.readLine());

        if(sp > cp){
            System.out.println("Profit of "+(sp-cp));
        }

        else if(cp==sp){
            System.out.println("Neither Profit Nor Loss");
        }

        else{
            System.out.println("Profit of "+(cp-sp));
        }

    }
    
}
