package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int a[]=new int[2];
        for (int i=0;i<nums.length;i++)
        {
          if(map.get(target-nums[i])!=null)
          {
              a[1]=i;
              a[0]=map.get(target-nums[i]);
          }
          else
            map.put(nums[i],i);
        }
        return a;
    }
}
