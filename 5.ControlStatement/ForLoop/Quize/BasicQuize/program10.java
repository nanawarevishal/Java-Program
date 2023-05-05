package ForLoop.Quize.BasicQuize;

public class program10 {
    public static void main(String[] args) {
        
        System.out.println("before for loop");

        for(int i,j;i<3;i++){
            System.out.println("Inside For");
        }

        System.out.println("Outside For");
    }
}

/*

 Output :
        program10.java:8: error: variable i might not have been initialized
                for(int i,j;i<3;i++){
                            ^
        1 error
        error: compilation failed

 Explanation - Here both variable i and j are not initialized, but we are only accessing the value of i, so the error is for i only

 */
