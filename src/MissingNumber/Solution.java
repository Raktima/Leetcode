package MissingNumber;

public class Solution {
    public int missingNumber(int[] nums) {
        int sum=0, n=nums.length,actualSum=n*(n+1)/2;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        return actualSum-sum;
    }
}
