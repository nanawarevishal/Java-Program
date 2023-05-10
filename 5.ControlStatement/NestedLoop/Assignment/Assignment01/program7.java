
/*
write a program to print the following pattern
D D D D
D D D D
D D D D
D D D D
 */


package NestedLoop.Assignment.Assignment01;

public class program7 {

    public static void main(String[] args) {
        
        int row = 4;

        for(int i=1;i<=row;i++){

            for(int j=1;j<=row;j++){

                System.out.print("D ");
            }
            System.out.println();
        }
    }
    
}
