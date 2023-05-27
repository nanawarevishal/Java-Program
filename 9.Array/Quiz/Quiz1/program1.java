package Quiz.Quiz1;

public class program1 {
    public static void main(String[] args) {
        int arr[];
        arr = {1,2,3,4};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}



/*

    program1.java:6: error: illegal start of expression
            arr = {1,2,3,4};
                ^
    program1.java:6: error: not a statement
            arr = {1,2,3,4};
                ^
    program1.java:6: error: ';' expected   
            arr = {1,2,3,4};
                    ^
    3 errors
    error: compilation failed


    Explanation: 
        An array can't be initialised as shown because the compiler will raise error.This way the array can be initialised but both declaration and assignment should be done on the same line

 */