package OneDimenArray.Quiz.Quiz1;

public class program8 {
    public static void main(String[] args) {
       
		int[] var1 = new int[2];
		var1[0] = 0;
		var1[1] = 1;

		System.out.println(var1[0] + " " + var1[1] + " " + var1.length + var1[2]);
        
    }
}

/*
 Output:
    There are indices 0,1 in array var1, accessing index 2 leads to
    ArrayIndexOutOfBoundsException
 */
