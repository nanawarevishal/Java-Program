
/*
  A 1 B 2
  A 1 B 2
  A 1 B 2

 */




package NestedLoop.ClassCodes;

public class program11 {
    public static void main(String[] args) {
        
        int row = 3;

        for(int i=1;i<=row;i++){

            int n = 1;
            char ch = 'A';
            for(int j=1;j<=4;j++){

                if(j %2==0){
                    System.out.print((n++)+" ");
                }
                else{
                    System.out.print(ch++ +" ");
                }

            }
            System.out.println();
        }
    }
}
