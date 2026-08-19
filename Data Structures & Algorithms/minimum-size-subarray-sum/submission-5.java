class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int i = 0;
        int ans = Integer.MAX_VALUE;

        for(int j = 0; j<nums.length; j++){
            if(sum<target){
                sum += nums[j];
            }

            while(sum >= target){
                int len = j - i + 1;
                ans = Math.min(len,ans); 
                sum -= nums[i];
                i++;
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}