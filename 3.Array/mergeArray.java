
// Write the programe to merge the two array into
// another array

public class mergeArray {
    public static void main(String[] args) {
        
        int a1[] = {2,1,4,5};
        int a2[]= {1,5};
        int k=0;

        int size =(int) a1.length+a2.length;

        int c[] = new int[size];
        // int x = a1.length;

        for(int i=0;i<a1.length;i++)
        {
            c[i] = a1[i];
        }

        for(int i=a1.length;i<size;i++)
        {
            c[i] =a2[k];
            k++;
        }

        for(int i=0;i<size;i++)
        {
            System.out.println(c[i]);
        }
    }
    
}
