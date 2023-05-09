

/*
 1160. Find Words That Can Be Formed by Characters
            Easy
            1.3K
            144
            Companies
            You are given an array of strings words and a string chars.

            A string is good if it can be formed by characters from chars (each character can only be used once).

            Return the sum of lengths of all good strings in words.

            

            Example 1:
            Input: words = ["cat","bt","hat","tree"], chars = "atach"
            Output: 6
            Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.

            Example 2:
            Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
            Output: 10
            Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
 */



package LeetCode;

public class program48 {

    static int countCharacters(String[] words, String chars) {

        int sum=0;

        char ch[] = chars.toCharArray();
        
        for(int i=0;i<words.length;i++){
            String str= words[i];

            for(int j=0;j<str.length();j++){

                for(int k=0;k<ch.length;k++){

                    if(str.charAt(j)==ch[i]);
                }
            }
        }


        return sum;
        
    }
    public static void main(String[] args) {

        String[] words = {"cat","bt","hat","tree"};

        String chars = "atach";

        System.out.println(countCharacters(words, chars));
        
    }
}
