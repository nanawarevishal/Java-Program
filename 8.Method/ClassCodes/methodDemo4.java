package ClassCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class methodDemo4 {

    static int add(int a,int b){
        return a+b;
    }

    static int sub(int a,int b){
        return a-b;
    }

    static int mult(int a,int b){
        return a*b;
    }

    static int div(int a,int b){
        return a/b;
    }
    
    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the two numbers: ");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.println("Addition: "+add(a, b));
        System.out.println("Subtraction: "+sub(a, b));
        System.out.println("Multiplication: "+mult(a, b));
        System.out.println("Division: "+div(a, b));
    }
}
