package ClassCodes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class program4 {
    
    public static void main(String[] args)throws IOException {
        
        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the Name: ");
        String ch = br.readLine();

        System.out.println(ch);

        System.out.println("Enter the integer Value: ");
        int n = Integer.parseInt(br.readLine());
        System.out.println(n);


        System.out.println("Enter the Float Value: ");
        float n1 = Float.parseFloat(br.readLine());
        System.out.println(n1);


        System.out.println("Enter the Double: ");
        double n2 = Double.parseDouble(br.readLine());
        System.out.println(n2);

        System.out.println("Enter the Character: ");
        char ch1 = br.readLine().charAt(0);
        System.out.println(ch1);



    }
}
