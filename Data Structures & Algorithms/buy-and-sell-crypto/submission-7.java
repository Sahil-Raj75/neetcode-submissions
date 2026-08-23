class Solution {
    public int maxProfit(int[] prices) {
        int high = 0;
        int low = Integer.MAX_VALUE;

        for(int currPrice : prices){
            if(currPrice < low){
                low = currPrice;
            }
            else{
                high = Math.max(currPrice - low ,high);
            }
        }
        return high;
    }
}