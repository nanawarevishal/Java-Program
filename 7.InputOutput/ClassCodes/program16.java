package ClassCodes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program16 {
    public static void main(String[] args)throws IOException {
        
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the string");
        boolean flag = Boolean.parseBoolean(br.readLine());

        System.out.println(flag);


        System.out.println("Enter the byte");

        byte bt = Byte.parseByte(br.readLine());
        System.out.println(bt);

        System.out.println("Enter the double value");
        double db = Double.parseDouble(br.readLine());

        System.out.println(db);

        
    }
}
