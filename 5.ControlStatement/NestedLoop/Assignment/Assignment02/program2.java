
/*
 write a program to print the following pattern
        4 4 4 4
        5 5 5 5
        6 6 6 6
        7 7 7 7
 */


package NestedLoop.Assignment.Assignment02;

public class program2 {

    public static void main(String[] args) {
        
        int row = 4;
        int x = row;
        for(int i=1;i<=row;i++){
            
            for(int j=1;j<=row;j++){

                System.out.print((x)+" ");
            }
            x++;

            System.out.println();
        }
    }
    
}
