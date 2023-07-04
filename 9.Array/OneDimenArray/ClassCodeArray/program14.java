package OneDimenArray.ClassCodeArray;

public class program14 {
    static void fun(int[] arr){
        arr[1] = 7000;
        arr[2] = 8000;

        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] ={1000,2000,3000,4000};
        System.out.println(System.identityHashCode(arr[1]));

        fun(arr);

        int x = 7000;
        int y = 8000;

        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(y));

        System.out.println(System.identityHashCode(arr[1]));
        System.out.println(System.identityHashCode(arr[2]));
    }
}
