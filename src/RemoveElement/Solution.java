package RemoveElement;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int i=-1;
        for(int j=0;j<nums.length;j++)
        {
            if(val!=nums[j])
                nums[++i]=nums[j];
        }
        return i+1;
    }
}
