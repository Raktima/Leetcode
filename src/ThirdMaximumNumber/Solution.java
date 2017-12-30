package ThirdMaximumNumber;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
                continue;
            set.add(nums[i]);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int a:set)
        {
            pq.add(a);
            if(pq.size()>3)
                pq.poll();
        }
        if(pq.size()<3)
        {
            while (pq.size()>1)
                pq.poll();
        }
        return pq.poll();
    }
}
