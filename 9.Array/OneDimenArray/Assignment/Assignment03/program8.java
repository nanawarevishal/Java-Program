

/*
        Program 8
        WAP to find an ArmStong number from an array and return its index.
        Take size and elements from the user
        Input: 10 25 252 36 153 55 89
        Output: Armstrong no 153 found at index: 4
 */


 package OneDimenArray.Assignment.Assignment03;
 import java.io.*;
 
 public class program8 {
 
     static int armStrongNumber(int[] arr){
 
         for(int i=0;i<arr.length;i++){

                int sum =0;
                int temp =arr[i];
                int temp1 = arr[i];
                int count=0;

                while(temp1!=0){
                    temp1/=10;
                    count++;
                }
                while(temp!=0){

                    int rev = temp%10;
                    
                    sum +=Math.pow(rev,count);

                    temp /=10;
                }

                if(sum == arr[i]){
                    return i;
                }
             
         }
 
         return -1;
     }
     public static void main(String[] args)throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
         System.out.println("Enter the size of the array: ");
         int size = Integer.parseInt(br.readLine());
 
         int a[] = new int[size];
 
         System.out.println("Enter the elements: ");
         for(int i=0;i<size;i++){
             a[i] = Integer.parseInt(br.readLine());
         }
 
         System.out.println(" Strong number found at index: "+armStrongNumber(a));
 
 
 
     }
     
 }
 