// Write the programe to print the array element 
// whos addition of the digits of that element is even



public class additionofElementEven {
    public static void main(String[] args) {
        int a[] = {21,2,45,66,34};

        for(int i=0;i<a.length;i++)
        {
            int n = a[i];
            int sum = 0;

            while(n!=0)
            {
                int rem = n%10;
                sum = sum + rem;

                n = n / 10;

            }

            if(sum % 2 ==0)
            {
                System.out.println(a[i]);
            }
        }
    }
}
