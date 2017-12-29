package ShortestUnsortedContinuousSubarray;

public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE, start=-1, end=-2, n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[n-i-1]);
            if(nums[i]<max) end=i;
            if(nums[n-i-1]>min) start=n-i-1;
        }
        return end-start+1;
    }
}
