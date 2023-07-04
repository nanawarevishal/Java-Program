package JaggedArray.ClassCodes;

public class program3 {
    public static void main(String[] args) {
        
        // Jagged Array Initialisation method 

        int arr[][] = new int[3][];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;i++)
            {
                System.out.print(arr[i][j]+" ");
            }

            System.out.println();
        }
    }
}

/*

Output: 

        Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "arr[0]" is null
                at JaggedArray.ClassCodes.program3.main(program3.java:11)
                
 */
