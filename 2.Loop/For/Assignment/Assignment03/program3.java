
/*
 Program 3 : write a program to print the following pattern
	14 15 16 17
	15 16 17 18
	16 17 18 19
	17 18 19 20

 */



package For.Assignment.Assignment03;

public class program3 {
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++)
        {
            int num =13+i;
            for(int j=1;j<=4;j++)
            {
                System.out.print(num+" ");
                num++;

            }
            System.out.println();
        }

    }
    
}
