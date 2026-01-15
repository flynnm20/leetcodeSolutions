class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i < prices.length; i++){
            if(prices[i] < minBuy) {
                minBuy = prices[i];
                continue;
            }
            else {
                maxProfit = Math.max(prices[i] - minBuy, maxProfit);
            }
        }
        return maxProfit;
    }

    /* what do we need at dp[n] to calculate it?
        max(dp[n], dp[n-1]) where dp[i] is the max profit you can get on a day. 
    */
}
