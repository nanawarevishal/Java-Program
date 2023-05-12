

/*

 10
 9 8
 7 6 5
 4 3 2 1

 */


package NestedLoop.ClassCodes;

public class program17 {
    public static void main(String[] args) {
        int row =5;
        
        int num=row*(row+1)/2;
        for(int i=1;i<=row;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num--;
            }
            System.out.println();
        }
    }
}
