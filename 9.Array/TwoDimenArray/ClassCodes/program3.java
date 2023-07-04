package TwoDimenArray.ClassCodes;

public class program3 {
    public static void main(String[] args) {
        int arr[][] = new int[2][3];
        arr[0][0]=10;
        arr[0][1]=20;
        arr[1][0]=30;
        arr[1][1]=40;

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i]+" ");
            }

            System.out.println();
        }
    }
}
