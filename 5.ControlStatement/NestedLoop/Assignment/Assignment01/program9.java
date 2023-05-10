

/*
 write a program to print the following pattern
C B A
C B A
C B A
 */

package NestedLoop.Assignment.Assignment01;

public class program9 {

    public static void main(String[] args) {
        
        int row=3;

        for(int i=1;i<=row;i++){

            char ch = (char)(64+row);
            for(int j=1;j<=row;j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
    
}
