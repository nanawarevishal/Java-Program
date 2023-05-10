


/*
 write a program to print the following pattern
1A 1A 1A
1A 1A 1A
1A 1A 1A
 */

package NestedLoop.Assignment.Assignment01;

public class program4 {

    public static void main(String[] args) {
        
        int row = 3;

        for(int i=1;i<=row;i++){

            for(int j=1;j<=row;j++){

                System.out.print("1A ");
            }
            System.out.println();
        }
    }
    
}
