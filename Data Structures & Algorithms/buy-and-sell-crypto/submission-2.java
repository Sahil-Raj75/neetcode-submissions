class Solution {
    public int maxProfit(int[] prices) {
        int left = 0 ;
        int maxprofit = 0;
        for(int right = left+1 ; right<prices.length; right++){
            if (prices[right]<prices[left]){
                left=right; // move the left to right
            }
            if (prices[right]>prices[left]){
                maxprofit = Math.max((prices[right]-prices[left]) , maxprofit);
            }
        }
        return maxprofit;
    }
}