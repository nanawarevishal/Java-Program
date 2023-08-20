
package CompileTime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class demo{

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the string: ");
        String name = br.readLine();
        System.out.println(name);

        System.out.println("Enter the character: ");
        char ch = (char)br.read();
        System.out.println(ch);
        br.skip(2);


        System.out.println("Enter the character: ");
        char ch1 = br.readLine().charAt(0);
        System.out.println(ch1);
    }

}
