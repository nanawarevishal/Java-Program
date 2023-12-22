package ClassCodes;


import java.io.InputStreamReader;

public class program3 {
    
    public static void main(String[] args)throws Exception {
       
        InputStreamReader isr = new InputStreamReader(System.in);

        System.out.println("Enter the character: ");
        char ch = (char)isr.read();
        System.out.println(ch);
        isr.close();

        System.out.println("Enter the character: ");

        char ch1 = (char)isr.read();
        System.out.println(ch1);

    }
}
