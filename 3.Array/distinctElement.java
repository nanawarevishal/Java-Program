public class distinctElement {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,40};
        
        int j;
        for(int i=0;i<a.length;i++)
        {
            for(j=0;j<i;j++)
            {
                if(a[i] == a[j])
                {
                    break;
                }
            }

            if(i==j)
            {
                System.out.println(a[i]);
            }
        }    
    }
}

