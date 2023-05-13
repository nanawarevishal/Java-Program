
/*

 58. Length of Last Word
            Easy
            3.1K
            163
            Companies
            Given a string s consisting of words and spaces, return the length of the last word in the string.

            A word is a maximal 
            substring
            consisting of non-space characters only.

            

            Example 1:
            Input: s = "Hello World"
            Output: 5
            Explanation: The last word is "World" with length 5.


            Example 2:
            Input: s = "   fly me   to   the moon  "
            Output: 4
            Explanation: The last word is "moon" with length 4.

            Example 3:
            Input: s = "luffy is still joyboy"
            Output: 6
            Explanation: The last word is "joyboy" with length 6.

 */

package LeetCode_String;
public class program4 {

    static int lengthOfLastWord(String s) {
        int len =0;

        String[] words = s.split("\s+");

        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }

        String lastWord = words[words.length-1];

        return lastWord.length();        

        
    }

    public static void main(String[] args) {

        String s = "   fly me   to   the moon  ";

        System.out.println(lengthOfLastWord(s));
        
    }
    
}
