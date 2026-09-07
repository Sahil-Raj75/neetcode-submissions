class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int prevMaxSum = 0;
        for(int i = 0; i<nums.length; i++){
            int a1 = nums[i];
            int a2 = prevMaxSum + nums[i];
            prevMaxSum = Math.max(a1,a2);

            maxSum = Math.max(maxSum,prevMaxSum);
        }

        // total Sum
        int total = 0;
        for(int num:nums){
            total+= num;
        }

        // min sum
        int minSum = Integer.MAX_VALUE;
        int prevBestMin = 0;
        for(int j=0; j<nums.length; j++){
            int v1 = nums[j];
            int v2 = prevBestMin + nums[j];
            prevBestMin = Math.min(v1,v2);

            minSum = Math.min(minSum,prevBestMin);
        }
        System.out.println(minSum);

        if(total-minSum == 0){
            return maxSum;
        }

        return Math.max(maxSum,total-minSum);
        
    }
}