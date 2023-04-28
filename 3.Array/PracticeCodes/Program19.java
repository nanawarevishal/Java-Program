/*
 Program : Given an array of size N-1 such that it only contains distinct integers 
 	      in the range of 1 to N. Find the missing element.

	      Input:
		N = 5
		A[] = {1,2,3,5}
	      Output: 4

	      Input:
		N = 10
		A[] = {6,1,2,8,3,4,7,10,5}
	      Output: 9
 */


package PracticeCodes;

public class Program19 {

    public static void main(String[] args) {
        
        int a[] = {6,1,2,8,3,4,7,10,5};

        for(int i=0;i<a.length;i++){

            for(int j=i+1;j<a.length;j++){

                if(a[i] > a[j]){

                    int temp = a[i];
                    a[i] =a[j];
                    a[j] = temp;
                }
            }
        }

        for(int x= 0;x<a.length;x++){

            System.out.print(a[x]+" ");
        }

        int i=0;

        int diff = a[i+1] - a[i];

        boolean flag = false;

        for(int j=0;j<a.length-1;j++){

            if(a[j+1]-a[j]!=diff){

                flag = true;

                System.out.println("The missing element is: "+(a[j]+diff));
            }

        }

        if(!flag){
            System.out.println("There is no missing element in array...!");
        }


    }
    
}
