

/*
 3 3 3
 4 4 4
 5 5 5

 */


package NestedLoop.ClassCodes;

public class program8 {

    public static void main(String[] args) {
        
        int row=3;
        int n = row;
        for(int i=1;i<=row;i++){

            for(int j=1;j<=row;j++){

                System.out.print(n+" ");
            }
            n++;
            System.out.println();
        }
    }
    
}
