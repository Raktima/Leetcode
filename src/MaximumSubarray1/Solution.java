package MaximumSubarray1;

public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++)
            sum+=nums[i];
        int maxsum=sum;
        for(int i=0;i<nums.length-k;i++)
        {
            sum+=nums[i+k]-nums[i];
            maxsum=Math.max(maxsum, sum);
        }
        // System.out.println(maxsum);
        return (double)maxsum/k;
    }
}
