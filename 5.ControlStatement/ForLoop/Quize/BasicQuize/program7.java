package ForLoop.Quize.BasicQuize;

public class program7 {
    public static void main(String[] args) {
        
        System.out.println("Before for loop");

        for(int i,j;i<3;i++,j++){
            System.out.println("Inside For");
        }

        System.out.println("After for loop");
    }
}


/*
  Output:

        program7.java:8: error: variable i might not have been initialized
                for(int i,j;i<3;i++,j++){
                            ^
        program7.java:8: error: variable j might not have been initialized
                for(int i,j;i<3;i++,j++){
                                    ^
        2 errors
        error: compilation failed
        
 */
