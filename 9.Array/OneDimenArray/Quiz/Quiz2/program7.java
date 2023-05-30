package OneDimenArray.Quiz.Quiz2;

public class program7 {
    public static void main(String arr[]) {

		float[] arrFloat = new float[5];

		for(int i=1; i<10; i++)
			arrFloat[i] = i + i;

		System.out.println(arrFloat[3]);
	}
}

/*
 Output:
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at OneDimenArray.Quiz.Quiz2.program7.main(program7.java:9)

Explanation: 
            Since the code is syntactically correct it doesn't give the compile time error it will give the error when we try to access the element outside index 4 it will give runtime Exception "ArrayIndexOutOfBound"
    
 */
