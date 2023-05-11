
/*

 write a program to print the following pattern
        C2W1 C2W2 C2W3
        C2W1 C2W2 C2W3
        C2W1 C2W2 C2W3


 */


package NestedLoop.Assignment.Assignment02;

public class program1 {
    public static void main(String[] args) {

        int row =3;

        for(int i=1;i<=row;i++){

            for(int j=1;j<=row;j++){

                System.out.print("C2W"+j+" ");
            }
            System.out.println();
        }
    }
}
