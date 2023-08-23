package RunTime;

import java.io.IOException;
import java.util.Scanner;

class NumberFormat{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            
            int x = sc.nextInt(0);
        }catch(ArithmeticException | NullPointerException obj){   // child class is give here only
            
            System.out.println("Exception Handled");
        }
    }
}