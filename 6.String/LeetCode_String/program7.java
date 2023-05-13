
/*
 316. Remove Duplicate Letters
            Medium
            6.8K
            432
            Companies
            Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is 
            the smallest in lexicographical order
            among all possible results.

            Example 1:
            Input: s = "bcabc"
            Output: "abc"

            Example 2:
            Input: s = "cbacdcbc"
            Output: "acdb"

 */

package LeetCode_String;

import java.util.ArrayList;
import java.util.List;

public class program7 {

    static String removeDuplicateLetters(String s) {

        List<Character> ls = new ArrayList<Character>();

        String str = "";
        for(int i=0;i<s.length();i++){

           if(!ls.contains(s.charAt(i))){
            ls.add(i, s.charAt(i));
            str +=ls.get(i);
           }
        }
        System.out.println(ls);

        return str;
        
    }

    public static void main(String[] args) {
        
        String s = "bcabc";

        String str = removeDuplicateLetters(s);
        System.out.println(str);
    }
    
}
