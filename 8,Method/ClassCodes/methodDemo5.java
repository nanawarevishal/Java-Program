package ClassCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class methodDemo5 {

    static int add(){
        return a+b;
    }


    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the two numbers: ");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        System.out.println("Addition: "+add());
    }
}


/*

            .\methodDemo5.java:9: error: cannot find symbol
                    return a+b;
                        ^   
            symbol:   variable a
            location: class methodDemo5
            .\methodDemo5.java:9: error: cannot find symbol
                    return a+b;
                            ^
            symbol:   variable b
            location: class methodDemo5
            2 errors
            error: compilation failed
            
 */
