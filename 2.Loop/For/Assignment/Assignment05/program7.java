

/*
 Program 7 : write a program to print the following pattern
	F
	E 1
	D 2 E
	C 3 D 4
	B 5 C 6 D
	A 7 B 8 C 9
 */

package For.Assignment.Assignment05;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program7 {
    public static void main(String[] args)throws Exception {

        
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows: ");
        int row  = Integer.parseInt(br.readLine());

        char ch = (char)(64+(row*row/row));
        char ch1 = ch;
        int num = 1;

        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j % 2 !=0)
                {
                    System.out.print(ch1+" ");
                    ch1++;
                }

                else
                {
                    System.out.print(num+" ");
                    num++;
                }
            }
            ch--;
            ch1 = ch;
            System.out.println();
        }
    }
    
}
