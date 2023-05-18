package ClassCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program5 {
    public static void main(String[] args) throws Exception{
       
        BufferedReader br = new BufferedReader((System.in));

        System.out.println("Enter the number: ");
        int num = Integer.parseInt(br.readLine());
        System.out.println(num);

        

    }
}

/*
 program5.java:9: error: no suitable constructor found for BufferedReader(InputStream)
        BufferedReader br = new BufferedReader((System.in));
                            ^
    constructor BufferedReader.BufferedReader(Reader,int) is not applicable
      (actual and formal argument lists differ in length)
    constructor BufferedReader.BufferedReader(Reader) is not applicable
      (argument mismatch; InputStream cannot be converted to Reader)
1 error
error: compilation failed
 */
