package Quiz.Quiz1;

public class program9 {
    public static void main(String[] args) {
        int[] var1 = new int[3];
		var1[1] = 1;
		var1[2] = 2;
		var1[3] = 3;
		System.out.println(var1[1] + " " + var1[2] + " " + var1[3]);
    }
}

/*
 Output:
    Exception

 Explanation:
    There are indices 0,1,2 in array var1, access to index 3 leads to 
    ArrayIndexOutOfBoundsException
 */
