
/*
 Input : str = "abaab"
Output: 3
Explanation : 
All palindrome substring are :
 "aba" , "aa" , "baab" 

Input : str = "abbaeae"
Output: 4
Explanation : 
All palindrome substring are : 
"bb" , "abba" ,"aea","eae"
 */

package LeetCode;

import java.util.ArrayList;

public class program1 {

    static int noPalindrome(String str){
        int cnt=0;

        ArrayList<String>st = new ArrayList<String>();

        for(int i=0;i<str.length();i++){

            for(int j=i+1;j<str.length();j++){

                st.add(str.substring(i, j));
            }

        }

        System.out.println(st);
        return cnt;
    }


    public static void main(String[] args) {
        
        String str = "abaab";

        System.out.println(noPalindrome(str));
    }
    
}
