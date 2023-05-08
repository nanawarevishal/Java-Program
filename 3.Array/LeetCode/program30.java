
/*
2575. Find the Divisibility Array of a String
            Medium
            414
            14
            Companies
            You are given a 0-indexed string word of length n consisting of digits, and a positive integer m.

            The divisibility array div of word is an integer array of length n such that:

            div[i] = 1 if the numeric value of word[0,...,i] is divisible by m, or
            div[i] = 0 otherwise.
            Return the divisibility array of word.

            

            Example 1:

            Input: word = "998244353", m = 3
            Output: [1,1,0,0,0,1,1,0,0]
            Explanation: There are only 4 prefixes that are divisible by 3: "9", "99", "998244", and "9982443".

            Example 2:
            Input: word = "1010", m = 10
            Output: [0,1,0,1]
            Explanation: There are only 2 prefixes that are divisible by 10: "10", and "1010".

 */


package LeetCode;


public class program30 {

    static int[] divisibilityArray(String word, int m) {
        
       int res[] = new int[word.length()];

       char[] ch = word.toCharArray();

       for(int i=0;i<ch.length;i++){

            for(int j=0;j<=i;j++){

                
            }

            if((int)ch[i] % m ==0){

                res[i] = 1;
            }
            else{
                res[i] =0;
            }
       }

        return res;
    }
    


    
    public static void main(String[] args) {

        String word = "998244353";

        int  m =3;

        int a[] = divisibilityArray(word, m);

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
    }
}
