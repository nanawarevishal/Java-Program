public class countDigitElement {
    public static void main(String[] args) {
        
        int a[] =new int[]{11,001};
        int cnt=0;

        for(int i=0;i<a.length;i++)
        {
            int temp = a[i];

            while(temp !=0)
            {
                int rem = temp % 10;

                if(rem==0)
                {
                    cnt++;
                }
                
                else
                {
                    cnt++;
                }
                
                temp /=10;
            }
            
            // System.out.println(str.length()+" ");
        }
    }
}
