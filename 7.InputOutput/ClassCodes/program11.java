package ClassCodes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program11 {
    public static void main(String[] args)throws IOException {
        
        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the string: ");
        String str = br.readLine();

        System.out.println("String : "+str);

        br.close();

        System.out.println("Enter the cahracter: ");
        char ch = (char)isr.read();


        System.out.println("Character: "+ch);
    }
}

/*
 Output:
 Exception in thread "main" java.io.IOException: Stream closed
        at java.base/java.io.BufferedInputStream.getBufIfOpen(BufferedInputStream.java:168)
        at java.base/java.io.BufferedInputStream.read(BufferedInputStream.java:334)
        at java.base/sun.nio.cs.StreamDecoder.readBytes(StreamDecoder.java:270)
        at java.base/sun.nio.cs.StreamDecoder.implRead(StreamDecoder.java:313)
        at java.base/sun.nio.cs.StreamDecoder.read(StreamDecoder.java:188)
        at java.base/sun.nio.cs.StreamDecoder.read0(StreamDecoder.java:137)
        at java.base/sun.nio.cs.StreamDecoder.read(StreamDecoder.java:122)
        at java.base/java.io.InputStreamReader.read(InputStreamReader.java:169)
        at ClassCodes.program11.main(program11.java:22)

 */
