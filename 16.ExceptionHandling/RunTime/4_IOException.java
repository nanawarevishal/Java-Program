package RunTime;

import java.io.*;

class IOExcept{

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the String: ");
        String str = br.readLine();
        System.out.println(str);

        br.close();

        System.out.println("Enter the String: ");
        String str2 = br.readLine();
        System.out.println(str2);
    }
}


/*

Ouput:
        Enter the String: 
        Core2Web
        Core2Web
        Enter the String: 
        Exception in thread "main" java.io.IOException: Stream closed
                at java.base/java.io.BufferedReader.ensureOpen(BufferedReader.java:123)
                at java.base/java.io.BufferedReader.readLine(BufferedReader.java:321)  
                at java.base/java.io.BufferedReader.readLine(BufferedReader.java:396)  
                at CompileTime.IOExcept.main(2_IOException.java:17)

                
 */
