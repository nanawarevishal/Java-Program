
/*
 Program 8 : write a program to print the following pattern
		Row =8
		$
		@ @
		& & &
		# # # #
		$ $ $ $ $
		@ @ @ @ @ @
		& & & & & & &
		# # # # # # # #
		USE THIS FOR LOOP STRICTLY for the outer loop
		Int row;

		Take row from user
		for(int i =1;i<=row;i++){

		}
 */

package For.Assignment.Assignment07;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program7 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Number of rows : ");
		int row = Integer.parseInt(br.readLine());

        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%4==0)
                {
                    System.out.print("#"+" ");
                }

                else if(i%2==0)
                {
                    System.out.print("@ ");
                }

                else if(i%3==0)
                {
                    System.out.print("& ");
                }

                else
                {
                    System.out.print("$ ");
                }
            }
            System.out.println();
        }
    }
}
