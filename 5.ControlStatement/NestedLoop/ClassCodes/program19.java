
/*

 A B C D
 A B C
 A B
 A

 */



package NestedLoop.ClassCodes;

public class program19 {

    public static void main(String[] args) {
        
        int row = 4;

        for(int i=1;i<=row;i++){
            char ch = 'A';

            for(int j=1;j<=row-i+1;j++){

                System.out.print(ch+++" ");
            }
            System.out.println();
        }
    }
    
}
