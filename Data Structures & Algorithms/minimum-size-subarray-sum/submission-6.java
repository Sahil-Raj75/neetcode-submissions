class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            int j = i;
            int sum = 0;
            while(j<nums.length && sum<target){
                sum += nums[j];
                j++;
            }
            if(sum >= target){
                int length = j - i;
                minLength = Math.min(length, minLength);
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}