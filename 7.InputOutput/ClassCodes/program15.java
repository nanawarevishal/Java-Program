package ClassCodes;

import java.util.Scanner;
import java.util.StringTokenizer;

public class program15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the player: ");
        String str = sc.nextLine();

       StringTokenizer st = new StringTokenizer(str, " ");

       while(st.hasMoreElements()){

            System.out.println(st.nextElement());
       }
    }
}
