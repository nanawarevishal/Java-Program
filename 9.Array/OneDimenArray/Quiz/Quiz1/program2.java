package OneDimenArray.Quiz.Quiz1;

public class program2 {
    public static void main(String[] args) {
        
        int[] var1 = new int[2];

        var1[0] =0;
        var1[1] =1;

        System.out.println(var1[0]);
        System.out.println(var1[0]+" "+var1[1]+" "+var1.length+" "+var1[2]);
    }
}

/*

    Output:
        Exception:ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2

  Explanation: 
    There are indices
 */
