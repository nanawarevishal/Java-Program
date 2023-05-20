package ClassCodes;

import java.io.*;

public class program7 {
    public static void main(String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the flat name: ");
        String bName = br.readLine();
        
        System.out.println("Enter the Wing: ");
        char ch = (char)(br.read());
        br.skip(2);

        System.out.println("Enter the flatNo");
        int flatNo = Integer.parseInt(br.readLine());

        System.out.println(bName);
        System.out.println(ch);
        System.out.println(flatNo);


    }
}
