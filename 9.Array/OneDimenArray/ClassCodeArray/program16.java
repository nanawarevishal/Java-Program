package OneDimenArray.ClassCodeArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class program16 {
    public static void main(String[] args)throws IOException {
        int arr1[] = new int[5];
        int arr2[] = new int[8];
        int arr3[] = new int[13];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Math.max(arr1.length,arr2.length);
        int stop = arr1.length;
        int x =0;
        int y = arr1.length;
        for(int i=0;i<max;i++){
            if(x<stop){
                arr1[x] = Integer.parseInt(br.readLine());
                arr3[x] = arr1[x];
            }

            arr2[i] = Integer.parseInt(br.readLine());
            arr3[y] = arr2[i];
            x++;
            y++;

        }

        System.out.println();

        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
    }
}
