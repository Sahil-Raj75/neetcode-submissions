class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        int i = 0 , j = 1;

        while(j<prices.length){
            if(prices[j] < prices[i]){
                i = j;
            }
            else{
                int currProfit = prices[j] - prices[i];
                maxProfit = Math.max(currProfit,maxProfit);
            }
            j++;
        }
        return maxProfit;
    }
}