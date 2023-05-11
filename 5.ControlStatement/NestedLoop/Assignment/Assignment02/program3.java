

/*

write a program to print the following pattern
        14 15 16 17
        15 16 17 18
        16 17 18 19
        17 18 19 20

 */


package NestedLoop.Assignment.Assignment02;

public class program3 {

    public static void main(String[] args) {
        
        int row=4;

        int num =14;
        for(int i=1;i<=row;i++){
            int n = num;
            for(int j=1;j<=row;j++){

                System.out.print((n++)+" ");
            }
            num++;
            System.out.println();
        }

    }
    
}
