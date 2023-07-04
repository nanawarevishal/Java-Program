package JaggedArray.ClassCodes;

public class program2 {
    public static void main(String[] args) {
        int [][]arr2 = {{1,2},{4,5,6},{7}};

        for(int x[] :arr2){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
