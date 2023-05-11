
/*
  A B C
  A B C
  A B C

 */



package NestedLoop.ClassCodes;

public class program10 {

    public static void main(String[] args) {
        
        int row=3;

        for(int i=1;i<=row;i++){
            
            char ch = (char)(64+1);

            for(int j=1;j<=row;j++){

                System.out.print(ch + " ");
                ch =  (char)(ch+1);
            }

            System.out.println();
        }
    }
    
}
