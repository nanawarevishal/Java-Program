public class secLargestElement {
    public static void main(String[] args) {
        int a[] ={1,35,12,3,34};

        int max = a[0];

        for(int i=0;i<a.length;i++)
        {
            if(max < a[i])
            {
                max =a[i];
            }
            // max = Math.max(max, a[i]);
        }

        int secmax = a[0];

        for(int i=0;i<a.length;i++)
        {
           
            if(a[i] != max)
            {
                if(secmax < a[i])
                {
                    secmax = a[i];
                }
                // secmax = Math.max(secmax, a[i]);
            }
        }

        System.out.println(secmax);
    }
    
}
