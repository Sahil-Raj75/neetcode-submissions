class Solution {
    public int longestOnes(int[] nums, int k) {
        int low = 0;
        int sum = 0;
        int high = 0;
        int res = 0;

        while(high < nums.length){
            sum += nums[high];
            int len = high - low + 1;

            // how many 0's in the curr window
            int diff = len - sum;

            while(diff>k){
                sum -= nums[low];
                low++;
                len = high - low + 1;
                diff = len - sum;
            }

            res = Math.max(len,res);
            high++;
        }
        return res;
    }
}