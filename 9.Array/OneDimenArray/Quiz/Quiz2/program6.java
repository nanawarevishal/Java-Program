package OneDimenArray.Quiz.Quiz2;

public class program6 {
    public static void main(String args[]) {

		int arr[5] = {1, 2, 3, 4, 5};

		for(int var : arr)
			System.out.print(var);                                                                                                 
	}
}


/*

Output:

		program6.java:6: error: ']' expected
						int arr[5] = {1, 2, 3, 4, 5};
								^
		program6.java:6: error: not a statement
						int arr[5] = {1, 2, 3, 4, 5};
									^
		program6.java:6: error: ';' expected
						int arr[5] = {1, 2, 3, 4, 5};
									^
		3 errors
		error: compilation failed



Explanation : 
	 While intiating the array in java size should not be mentioned it generates the sytax error.
 */
