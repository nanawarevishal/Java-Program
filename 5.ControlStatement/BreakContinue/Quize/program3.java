package BreakContinue.Quize;

public class program3 {
    public static void main(String[] args) {
        
        int var=10;

        while(var>0){
            System.out.println(var);
            var--;

            if(var<5){
                break;
            }
        }
    }
}

/*
 Output

 10
9
8
7
6
5
 */
