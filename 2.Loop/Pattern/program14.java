
/*
 *  A B C D
 *  A B C
 *  A B
 *  A
 */


package Pattern;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program14 {
    
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the the number of rows: ");
        int row = Integer.parseInt(br.readLine());
        
        for(int i=1;i<=row;i++)
        {
            char ch = 'A';
            for(int j=1;j<=(row-i+1);j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();

        }
    }
}