package BreakContinue.Quize;

public class program2 {
    public static void main(String[] args) {
        
        int var=10;

        if(var=10){
            break;
            System.out.println("Var="+var2);
        }
    }
}

/*
Output:

        program2.java:8: error: incompatible types: int cannot be converted to boolean
                if(var=10){
                    ^
        program2.java:9: error: break outside switch or loop
                    break;
                    ^
        program2.java:10: error: cannot find symbol
                    System.out.println("Var="+var2);
                                            ^
        symbol:   variable var2
        location: class program2
        3 errors
        error: compilation failed

        
 */
