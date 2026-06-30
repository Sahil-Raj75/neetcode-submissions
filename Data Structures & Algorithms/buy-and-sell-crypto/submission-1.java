class Solution {
    public int maxProfit(int[] prices) {
        int l = 0 ;
        int maxprofit = 0;
        for(int r = l+1 ; r<prices.length; r++){
            if (prices[r]<prices[l]){
                l=r;
            }
            if (prices[r]>prices[l]){
                maxprofit = Math.max((prices[r]-prices[l]) , maxprofit);
            }
        }
        return maxprofit;
    }
}
