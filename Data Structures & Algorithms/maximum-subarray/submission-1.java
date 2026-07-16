class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = nums[0];

        for(int i =0; i<nums.length;i++){
            //step1: create sum 
            currSum+=nums[i];
            // step2: take the max sum always
            if(currSum > maxSum){
                maxSum = currSum;
            }
            // step3: dont consider the negatives cuz ie always decrease the overall sum in any condition.
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
}
