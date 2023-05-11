/*
  290. Word Pattern
        Easy
        6.2K
        737
        Companies
        Given a pattern and a string s, find if s follows the same pattern.

        Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

    
        Example 1:
        Input: pattern = "abba", s = "dog cat cat dog"
        Output: true

        Example 2:
        Input: pattern = "abba", s = "dog cat cat fish"
        Output: false

        Example 3:
        Input: pattern = "aaaa", s = "dog cat cat dog"
        Output: false

 */

package LeetCode_String;

import java.util.HashMap;

public class program3 {

    static boolean wordPattern(String pattern, String s) {
        boolean flag  = false;

        HashMap<char[],String> map = new HashMap<char[],String>();

        if(s.length()!=pattern.length()){
            return false;
        }

        else{
            
        }

        return flag;
        
    }
    public static void main(String[] args) {

        String s ="dog cat cat dog";
        String pattern = "abba";

        System.out.println(wordPattern(pattern,s));
        
    }
}
