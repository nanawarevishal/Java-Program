
import java.util.Scanner;

public class OvalElement {
    public static void main(String[] args)throws Exception {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            char ch[] = new char[size];

            System.out.println("Enter the char element: ");
            for(int i=0;i<ch.length;i++)
            {
                ch[i] = sc.next().charAt(0);
            }

            System.out.println("The wowel characters are: ");

            for(int i=0;i<ch.length;i++)
            {
                if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
                {
                    System.out.println(ch[i]);
                }
            }
        }
    }
}
