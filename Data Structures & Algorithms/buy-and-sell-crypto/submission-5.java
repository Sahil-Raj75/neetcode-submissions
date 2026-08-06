class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            }
            else{
                maxProfit = Math.max(price - minPrice ,maxProfit);
            }
        }
        return maxProfit;
    }
}