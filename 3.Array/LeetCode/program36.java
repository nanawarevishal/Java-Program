

/*
 2570. Merge Two 2D Arrays by Summing Values
            Easy
            209
            6
            Companies
            You are given two 2D integer arrays nums1 and nums2.

            nums1[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.
            nums2[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.
            Each array contains unique ids and is sorted in ascending order by id.

            Merge the two arrays into one array that is sorted in ascending order by id, respecting the following conditions:

            Only ids that appear in at least one of the two arrays should be included in the resulting array.
            Each id should be included only once and its value should be the sum of the values of this id in the two arrays. If the id does not exist in one of the two arrays then its value in that array is considered to be 0.
            Return the resulting array. The returned array must be sorted in ascending order by id.

            

            Example 1:
            Input: nums1 = [[1,2],[2,3],[4,5]], nums2 = [[1,4],[3,2],[4,1]]
            Output: [[1,6],[2,3],[3,2],[4,6]]
            Explanation: The resulting array contains the following:
            - id = 1, the value of this id is 2 + 4 = 6.
            - id = 2, the value of this id is 3.
            - id = 3, the value of this id is 2.
            - id = 4, the value of this id is 5 + 1 = 6.


            Example 2:
            Input: nums1 = [[2,4],[3,6],[5,5]], nums2 = [[1,3],[4,3]]
            Output: [[1,3],[2,4],[3,6],[4,3],[5,5]]
            Explanation: There are no common ids, so we just include each id with its value in the resulting list.

 */



package LeetCode;

public class program36 {

    static int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        int res[][] = new int[nums1.length+nums2.length][];

        int id=1;

        for(int i=0;i<nums1.length;i++){
            
            for(int j=0;j<nums2.length;j++){

                if(nums1[i][0]==id && nums2[i][0]==id){
                    res[i][0]=id;
                     res[i][1] = nums1[i][1]+nums2[i][1];
                    
                }
                else if(nums1[i][0]==id){
                    res[i][0]=id;
                    res[i][1] = nums1[i][1];
                }

                else{
                    res[i][0]=id;
                    res[i][1] = nums1[i][1];
                }
                id++;
            }
        }

        return res;
      
    }

    public static void main(String[] args) {
        int num1[][] = {{1,2},{2,3},{4,5}};

        int num2[][] ={{1,4},{3,2},{4,1}};

        int[][] a = mergeArrays(num1, num2);

        for(int i=0;i<a.length;i++){

            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
