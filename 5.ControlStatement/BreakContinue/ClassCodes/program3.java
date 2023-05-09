
/*
 if no betn 1-40 is div by 3 and 5;
 */


package BreakContinue.ClassCodes;

public class program3 {
    public static void main(String[] args) {
        
        for(int i=1;i<=40;i++){

            if(i%3==0 && i%5==0){
                break;
            }
            System.out.println(i);
        }

    }
}
