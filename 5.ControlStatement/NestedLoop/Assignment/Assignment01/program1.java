
/*
 write a program to print the following pattern
C2W C2W C2W
C2W C2W C2W
C2W C2W C2W

 */


package NestedLoop.Assignment.Assignment01;

public class program1 {

    public static void main(String[] args) {
        
        int row = 3;

        for(int i=1;i<=row;i++){

            for(int j=1;j<=row;j++){

                System.out.print("C2W ");
            }

            System.out.println();
        }
    }
    
}
