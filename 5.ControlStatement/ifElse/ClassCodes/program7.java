/*
 electricity bill problem
 Given an integer input A which represents units of electricity consumed at your house
 calculate and print the bill amount.
 units <=100 :price per unit is 1
 units >100 :price per unit is 2

 input:50
 output:50

 input:200
 output:300
 
 */


 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 
 public class program7 {
     public static void main(String[] args)throws Exception {
 
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
         System.out.println("Enter the number: ");
         int units = Integer.parseInt(br.readLine());

         if(units > 100){
            System.out.println((units-100)*2+100);
         }

         else{
            System.out.println(units);
         }
     }
 }