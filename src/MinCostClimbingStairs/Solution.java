package MinCostClimbingStairs;

public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[][]=new int[2][cost.length];
        dp[0][0]=0;
        dp[1][0]=cost[0];
        for(int i=1;i<cost.length;i++)
        {
            dp[0][i]=dp[1][i-1];

            dp[1][i]=Math.min(dp[0][i-1],dp[1][i-1])+cost[i];

        }
        return Math.min(dp[0][cost.length-1],dp[1][cost.length-1]);
    }
}
