package NullPointerException.ClassCodes;

public class program1 {
    public static void main(String[] args) {
        int arr[][] = new int[3][];
        int arr1[][] = {{},{},{}};
        
        System.out.println(arr1.length);
        System.out.println(arr1[0].length);

        // System.out.println(arr.length);
        // System.out.println(arr[0].length);  //Incomplete array - NULL pointer exception

        int arr2[] = {1,2,3};
        arr2 = new int[5];

        System.out.println(arr2.length);

    }
}
