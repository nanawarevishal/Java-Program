package ClassCodes;

import java.io.*;
import java.util.StringTokenizer;

public class program13 {
    public static void main(String[] args)throws IOException {
        
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Society name,Wing,Flat No");

        br.close();
        String info = br.readLine();

        StringTokenizer st = new StringTokenizer(info, " ");
    

        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());

    }
}
