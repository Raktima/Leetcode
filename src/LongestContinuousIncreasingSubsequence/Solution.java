package LongestContinuousIncreasingSubsequence;

import sun.nio.cs.ext.MacArabic;

public class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0)
            return 0;
        int start=0, end=0, max=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])
            {
                end=i;
                max= Math.max(max,end-start+1);
            }
            else
            {
                start=i;
            }
        }
        return max;
    }
}
