
/*
 *  5 4 3 2 1
 *  5 4 3 2
 *  5 4 3
 *  5 4
 *  5
 */



package Pattern;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program5 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        for(int i=1;i<=row;i++)
        {
            int num =row;

            for(int j=row;j>=i;j--)
            {
                System.out.print(num+" ");
                num--;
            }

            System.out.println();
        }
    }
    
}
