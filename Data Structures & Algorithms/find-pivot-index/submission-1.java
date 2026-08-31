class Solution {
    public int pivotIndex(int[] nums) {
        int n= nums.length;
        int left = 0;
        int right = 0;
        int sum = 0;
        for(int num:nums){
            sum+=num;
        }

        if(right == sum - nums[0]){
            return 0;
        }
        for(int i = 1; i<n; i++){
            left += nums[i-1];
            right = sum - left - nums[i];
            if(left == right){
                return i;
            }
        }
        return -1;
    }
}