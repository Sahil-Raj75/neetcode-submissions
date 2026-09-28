class Solution {
    public int maxSubArray(int[] nums) {
        int prevSum = 0;
        int currSum = 0;
        int ans = nums[0];

        for(int num : nums){
            prevSum += num;
            currSum = num;

            if(currSum > prevSum){
                prevSum = currSum;
            }

            ans = Math.max(ans,prevSum);
        }
        return ans;
    }
}