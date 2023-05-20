package ClassCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program9 {
    public static void main(String[] args){
        
        BufferedReader br1  = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br1.readLine();

        String str2 = br2.readLine();
        
    }
}


/*
        program9.java:13: error: unreported exception IOException; must be caught or declared to be thrown
                String str1 = br1.readLine();
                                        ^
        program9.java:15: error: unreported exception IOException; must be caught or declared to be thrown
                String str2 = br2.readLine();
                                        ^
        2 errors
        error: compilation failed
 */
