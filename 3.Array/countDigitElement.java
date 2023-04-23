public class countDigitElement {
    public static void main(String[] args) {
        
        int a[] =new int[]{11,001};
        int cnt=0;

        for(int i=0;i<a.length;i++)
        {
            int temp = a[i];

            while(temp !=0)
            {
                cnt++;
                
                temp /=10;
            }
            
            
            System.out.println(cnt+" ");
        }
    }
}
