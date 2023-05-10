

/*
 write a program to print the following pattern

d d d d
c c c c
b b b b
a a a a
 */


package NestedLoop.Assignment.Assignment01;

public class program8 {

    public static void main(String[] args) {
        
        int row = 4;

        char ch = (char)(64+row);
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){

                System.out.print(ch+" ");
            }
            ch--;
            System.out.println();
        }
    }
    
}
