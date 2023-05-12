
/*
 write a program to print the following pattern
3C 3C 3C 3C
3C 3C 3C
3C 3C
3C
 */




package NestedLoop.Assignment.Assignment03;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class program4 {
    public static void main(String[] args)throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of rows: ");
        int row = Integer.parseInt(br.readLine());


        for(int i=1;i<=row;i++){

            for(int j=1;j<=(row-i+1);j++){
                System.out.print("3C ");
                
            }
            System.out.println();
        }
    }

}
