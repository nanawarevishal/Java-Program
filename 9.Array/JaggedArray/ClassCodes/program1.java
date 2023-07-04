package JaggedArray.ClassCodes;

public class program1 {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];

        int [][]arr2 = {{1,2},{4,5,6},{7}};

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
