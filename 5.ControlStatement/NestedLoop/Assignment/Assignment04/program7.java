
/*
 write a program to print the following pattern
F
E 1
D 2 E
C 3 D 4
B 5 C 6 D
A 7 B 8 C 9
 */


package NestedLoop.Assignment.Assignment04;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program7 {
    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        int num=1;
        for(int i=1;i<=row;i++){
            
            char ch = (char)(65+row-i);
            for(int j=1;j<=i;j++){

                if(j%2==0){
                    System.out.print(num+" ");
                    num++;
                }
                else{
                    System.out.print(ch+++" ");
                }
               
            }
            System.out.println();
        }

    }
}
