
/*

write a program to print the following pattern
        1A 2B 3C
        1A 2B 3C
        1A 2B 3C

 */


package NestedLoop.Assignment.Assignment02;

public class program4 {
    
    public static void main(String[] args) {
        
        int row = 3;
        

        for(int i=1;i<=row;i++){

            char ch = (char)(64+1);
            for(int j=1;j<=row;j++){

                System.out.print(j);
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }

    }
}
