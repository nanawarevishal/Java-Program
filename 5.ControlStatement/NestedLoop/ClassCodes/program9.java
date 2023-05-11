
/*
  1 2 3
  4 5 6
  7 8 9
 */



package NestedLoop.ClassCodes;

public class program9 {
    public static void main(String[] args) {
        
        int  row = 3;

        int num =1;
        for(int i=1;i<=row;i++){

            for(int j=1;j<=row;j++){

                System.out.print(num+++" ");
            }
            System.out.println();
        }
    }
}
