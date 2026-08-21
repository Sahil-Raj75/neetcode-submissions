class Solution {
    public int longestOnes(int[] nums, int k) {
        int low = 0;
        int sum = 0;
        int res = 0;

        for(int high = 0; high<nums.length; high++){
            sum += nums[high];
            int len = high - low + 1;
            // number of 0's kitne hai
            int diff = len - sum;

            // agar number of 0's jada hai k se
            while(diff>k){
                sum -= nums[low];
                low++;
                len = high - low + 1;
                diff = len - sum;
            }

            // diff <= k hai tho window valid hai
            res = Math.max(len,res);
        }
        return res;
    }
}