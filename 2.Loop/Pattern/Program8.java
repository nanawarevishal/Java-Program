
/*
 * D4 C3 B2 A1
 * A1 B2 C3 D4
 * D4 C3 B2 A1
 * A1 B2 C3 D4
 */


package Pattern;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program8 {
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        char ch = (char)(64+row+1);
        int num = row+1;

        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=row;j++)
            {
                if(i % 2 !=0)
                {
                    ch--;
                    num--;
                    System.out.print(ch);
                    System.out.print(num+" ");
                }

                else
                {
                    System.out.print(ch);
                    System.out.print(num+" ");
                    ch++;
                    num++;
                }

            }

            System.out.println();
        }
        
    }
    
}
