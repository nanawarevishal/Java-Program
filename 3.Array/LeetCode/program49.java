

/*
 744. Find Smallest Letter Greater Than Target
            Easy
            2.9K
            2K
            Companies
            You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

            Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

            

            Example 1:
            Input: letters = ["c","f","j"], target = "a"
            Output: "c"
            Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.


            Example 2:
            Input: letters = ["c","f","j"], target = "c"
            Output: "f"
            Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.

            Example 3:
            Input: letters = ["x","x","y","y"], target = "z"
            Output: "x"
            Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
 */



package LeetCode;

public class program49 {

    static char nextGreatestLetter(char[] letters, int target) {

        char ch='a';

        int a = (int)target;

        
        boolean flag = false;
        for(int i=0;i<letters.length;i++){
            if(a<(int)letters[i]){
                flag = true;
                return letters[i];
            }
        }

        if(!flag){
            return letters[0];
        }

        return ch;
        
    }
    public static void main(String[] args) {

        char[] letters = {'c','f','j'};
        char target ='a';
        System.out.println(nextGreatestLetter(letters,target));;
        
    }
}
