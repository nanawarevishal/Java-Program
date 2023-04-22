/*
 *  O
 *  14 13
 *  L  K  J
 *  9  8  7  6
 *  E  D  C  B  A    
 
 */

package Pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program2 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        char ch = (char)((64+((row*row)+row)/2));
        int num  = ((row*row)+row)/2;
        
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i % 2 !=0)
                {
                    System.out.print(ch+" ");
                }

                else
                {
                    System.out.print(num+" ");
                }
                ch--;
                num--;
            }
            System.out.println();

        }
    }
    
}
