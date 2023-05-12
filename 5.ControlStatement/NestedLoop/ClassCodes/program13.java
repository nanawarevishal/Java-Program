
/*
 *   *
 *   *
 *   *
 *   *
 */



package NestedLoop.ClassCodes;


public class program13 {
    public static void main(String[] args) {
        int row=4;

        // for(int i=1;i<=row;i++){

        //     for(int j=1;j<=row;j++){

        //         if(j==1 || j==row){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }


        for(int i=1;i<=row;i++){

            for(int j=1;j<=row;j++){

                if(j % row==1 || j%row==0){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }



    }
}
