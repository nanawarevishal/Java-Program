// Write the programe to find the
// Uncommon element from the two array



public class UncommonElements
 {
    public static void main(String[] args) {
        
        int a1[] = {1,2,3,5};
        int a2[] = {2,1,9,8};

 
        boolean present = false;

        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<a2.length;j++)
            {
                if(a1[i]== a2[j] || a2[i]==a1[j])
                {
                    present = false;
                    break;
                }
                else
                {
                    present = true;
                }

            }

            if(present)
            {
                System.out.println(a1[i]+" "+a2[i]);
            }
        }

    }
    
}
