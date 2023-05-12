
/*
 write a program to print the following pattern
10
I H
7 6 5
D C B A
 */


package NestedLoop.Assignment.Assignment04;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program8 {
    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows: ");
        int row = Integer.parseInt(br.readLine());

        int num=10;
        char ch = (char)(64+num);
        for(int i=1;i<=row;i++){
            
            for(int j=1;j<=i;j++){

                if(i%2==1){
                    System.out.print(num+" ");
                }
                else{
                    System.out.print(ch+" ");
                }
                num--;
                ch--;
               
            }
            System.out.println();
        }

    }
}
