
/*
 write a program to print the following pattern
14 14 14 14
15 15 15 15
16 16 16 16
17 17 17 17
 */



package NestedLoop.Assignment.Assignment01;

public class program3 {

    public static void main(String[] args) {
        
        int row = 4;

        int n= 14;
        for(int i=1;i<=row;i++){

            for(int j=1;j<=row;j++){

                System.out.print(n+" ");
            }
            n++;
            System.out.println();
        }
    }
    
}
