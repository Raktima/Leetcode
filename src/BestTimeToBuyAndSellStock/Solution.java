package BestTimeToBuyAndSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
        int minCP=Integer.MAX_VALUE, maxProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(minCP>prices[i])
                minCP=prices[i];
            else
                maxProfit=Math.max(maxProfit,prices[i]-minCP);
        }
        // System.out.println(minCP);
        return maxProfit;

    }
}
