
/*
 write a program to print the following pattern
4 5 6 7
4 5 6 7
4 5 6 7
4 5 6 7

 */

package NestedLoop.Assignment.Assignment01;

public class program2 {
    public static void main(String[] args) {

        int row=4;

        for(int i=1;i<=row;i++){

            int x= row;
            for(int j=1;j<=row;j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
        
    }
}
