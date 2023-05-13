
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
import java.util.Map;

import javax.print.FlavorException;

public class program6 {

    static boolean wordPattern(String pattern, String s) {
        String str[] = s.split(" ");

        if(pattern.length()!=str.length){
            return false;
        }

        Map<Character, String> hm
            = new HashMap<Character,String>();


        for(int i=0;i<pattern.length();i++){
            hm.putIfAbsent(pattern.charAt(i),str[i]);

        }

        System.out.println(hm);
        for(int i=0;i<pattern.length();i++){
            if(hm.containsKey(pattern.charAt(i))!=hm.containsValue(str[i])){

                return false;
            }
        }

        // System.out.println(hm);
        return true;
        
    }

    public static void main(String[] args) {

        String pattern = "aaaa";

        String s = "dog dog dog dog";

        System.out.println(wordPattern(pattern, s));
        
    }
    
}
