package ClassCodes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program8 {
    
    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Buliding name: ");
        String bName = br.readLine();

        // System.out.println("Enter the wing name: ");
        // char wing = (char)br.read();
        br.close();


        System.out.println("Enter the flat Number: ");
        int flaNO = Integer.parseInt(br2.readLine());

        System.out.print("Building Name: "+bName);
        // System.out.println("Wing Name: "+wing);
        System.out.println("Flat Number: "+flaNO);

    }
}
