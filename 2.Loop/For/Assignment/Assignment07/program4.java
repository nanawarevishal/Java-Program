
/*
 Program 5 : write a program to print the following pattern
		Row =4
		0
		1 1
		2 3 5
		8 13 21 34
		USE THIS FOR LOOP STRICTLY for the outer loop
		Int row;
		Take the number of rows from user
		for(int i =1;i<=row;i++){

		}
 */


package For.Assignment.Assignment07;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program4 {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number of rows: ");
		int row = Integer.parseInt(br.readLine());
        int n1=0,n2=1,n3;

        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(n1+" ");
                n3 = n1+n2;
                n1=n2;
                n2=n3;
            }
            System.out.println();
        }
        
    }
    
}
