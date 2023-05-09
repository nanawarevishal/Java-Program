
/*
739. Daily Temperatures
            Medium
            10.5K
            236
            Companies
            Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

            
            Example 1:
            Input: temperatures = [73,74,75,71,69,72,76,73]
            Output: [1,1,4,2,1,1,0,0]


            Example 2:
            Input: temperatures = [30,40,50,60]
            Output: [1,1,1,0]


            Example 3:
            Input: temperatures = [30,60,90]
            Output: [1,1,0]


 */



package LeetCode;

;


public class program47 {

    static int[] dailyTemperatures(int[] temperatures) {

        int[] answer = new int[temperatures.length];

        for(int i=0;i<temperatures.length;i++){

            if(i==temperatures.length-1){
                answer[i] = 0;
            }
            else if(temperatures[i]<temperatures[i+1]){
                answer[i] = 1;
            }

            else{
                for(int j=i+2;j<temperatures.length;j++){
                    if(temperatures[i]<temperatures[j]){
            
                        answer[i] = j-i;
                        break;
                    }
                }
                
            }
        }

        return answer;
        
    }

//  Output: [1,1,4,2,1,1,0,0]

    public static void main(String[] args) {

        int[] temperatures = {73,74,75,71,69,72,76,73};

        int[] a = dailyTemperatures(temperatures);

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    
    }
    
}
