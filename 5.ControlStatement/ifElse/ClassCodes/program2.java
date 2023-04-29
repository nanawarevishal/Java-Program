

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program2 {
    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number1: ");
        int x = Integer.parseInt(br.readLine());

        System.out.println("Enter the number2: ");
        int y =Integer.parseInt(br.readLine());

        if(x>y){
            System.out.println(x+" is greater");
        }

        else if(x==y){
            System.out.println("Both are equal.");
        }

        else{
            System.out.println(y+" is greater");
        }
    }
}
