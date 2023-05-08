/*
 2559. Count Vowel Strings in Ranges
            Medium
            329
            10
            Companies
            You are given a 0-indexed array of strings words and a 2D array of integers queries.

            Each query queries[i] = [li, ri] asks us to find the number of strings present in the range li to ri (both inclusive) of words that start and end with a vowel.

            Return an array ans of size queries.length, where ans[i] is the answer to the ith query.

            Note that the vowel letters are 'a', 'e', 'i', 'o', and 'u'.

            

            Example 1:
            Input: words = ["aba","bcb","ece","aa","e"], queries = [[0,2],[1,4],[1,1]]
            Output: [2,3,0]
            Explanation: The strings starting and ending with a vowel are "aba", "ece", "aa" and "e".
            The answer to the query [0,2] is 2 (strings "aba" and "ece").
            to query [1,4] is 3 (strings "ece", "aa", "e").
            to query [1,1] is 0.
            We return [2,3,0].

            Example 2:
            Input: words = ["a","e","i"], queries = [[0,2],[0,1],[2,2]]
            Output: [3,2,1]
            Explanation: Every string satisfies the conditions, so we return [3,2,1].


 */


package LeetCode;

public class program31 {

    static int[] vowelStrings(String[] words, int[][] queries) {

        int[] res = new int[queries.length];

        int col=0;
        for(int i=0;i<queries.length;i++){

            int start = queries[i][col];
            int end = queries[i][col+1];

            int cnt=0;
            for(int j=start;j<=end;j++){

                String str = words[j];

                if((str.charAt(0)=='a' || str.charAt(0)=='e' || str.charAt(0)=='i' || str.charAt(0)=='o' || str.charAt(0)=='u' )&& (str.charAt(str.length()-1)=='a' || str.charAt(str.length()-1)=='e' || str.charAt(str.length()-1)=='i' || str.charAt(str.length()-1)=='o' || str.charAt(str.length()-1)=='u')){
                    cnt++;
                }

                res[i] = cnt;

            }
            
        }

        return res;
        
    }

    public static void main(String[] args) {

        String[] words = {"a","e","i"};

        int queries[][]  ={{0,2},{0,1},{2,2}};

        int a[] = vowelStrings(words, queries);

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
