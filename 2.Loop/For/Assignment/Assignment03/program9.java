
/*
 Program 9 : write a program to print the following pattern
	1C3  4B2  9A1
	16C3 25B2 36A1
	49C3 64B2 81A1
 */



package For.Assignment.Assignment03;

public class program9 {
    public static void main(String[] args) {
        int num1=1;
        for(int i=1;i<=3;i++)
        {
            char ch ='C';
            int num=3;
            for(int j=1;j<=3;j++)
            {
                System.out.print(num1*num1);
                System.out.print(ch);
                System.out.print(num+" ");
                ch--;
                num--;
                num1++;
                 
            }
            System.out.println();
        }
    }
}
