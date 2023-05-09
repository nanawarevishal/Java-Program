package BreakContinue.Quize;

public class program4 {
    public static void main(String[] args) {
        
        int var=10;

        while(var>5){

            System.out.println(var);
            break;
            var--;
        }
    }
}


/*
 Output:
            program4.java:12: error: unreachable statement
                    var--;
                    ^
                1 error
                error: compilation failed
 */
