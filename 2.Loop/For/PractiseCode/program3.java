/*
           1
        2  3
     4  5  6
  7  8  9  10
 */

package For.PractiseCode;

public class program3 {
    public static void main(String[] args) throws Exception {

        int row =4;
        // int sp = 1;
        // int count = 1;
        int num = 1;
        // for (int i = 1; i <= 4; i++) {
        //     if (count == sp) {
        //         for (int j = 3; j >= sp; j--) {
        //             System.out.print(" ");
        //         }
        //         sp++;
        //     }
        //     System.out.print(num + " ");
        //     num++;

        //     if (count == i) {
        //         i = 0;
        //         count++;
        //         System.out.println();
        //     }

        //     if ((count - 1) == 4) {
        //         break;
        //     }

        // }

        for(int i=1;i<=row;i++){

            for(int j=2*(row-i);j>=1;j--){

                System.out.print(" ");
            }

            for(int k=1;k<=i;k++)
            {
                System.out.print(num+" ");
                num++;
            }

            System.out.println();
        }
    }

}
