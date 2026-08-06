class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            }
            else{
                int currProfit = price - minPrice;
                maxProfit = Math.max(currProfit,maxProfit);
            }
        }
        return maxProfit;
    }
}