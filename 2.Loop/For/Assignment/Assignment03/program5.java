
/*
 Program 5 : write a program to print the following pattern
	26 Z 25 Y
	24 X 23 W
	22 V 21 U
	20 T 19 S
 */



package For.Assignment.Assignment03;

public class program5 {
    public static void main(String[] args) {

        char ch ='Z';
        int num =26;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(j %2==0)
                {
                    System.out.print(ch+" ");
                    ch--;
                }
                else
                {
                    System.out.print(num+" ");
                    num--;
                }
            }
            System.out.println();
        }
        
    }
}
