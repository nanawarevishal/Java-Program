package OneDimenArray.Quiz.Quiz2;

public class program10 {

    public static void main(String arr[]) {

		short arr[];
		arr = {10, 20, 30, 40};

		System.out.println(arr.length);
	}
    
}

/*

Output:
        program10.java:7: error: illegal start of expression
                        arr = {10, 20, 30, 40}  
                            ^
        program10.java:7: error: not a statement
                        arr = {10, 20, 30, 40}  
                            ^
        program10.java:7: error: ';' expected
                        arr = {10, 20, 30, 40}
                                ^
        3 errors
        error: compilation failed

Explanation:
            Cann't assign value in this manner syntax error


 */
