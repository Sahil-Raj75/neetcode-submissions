class Solution {
    public int maxSubArray(int[] nums) {
        int bestSum = 0;
        int ans = nums[0];

        for(int num : nums){
            // har ek index ke lye 2 choise ya tho piche ke sum ke sath mil k jaye ya tho khud akele rahe (aab mile k or akele jo bhi max bana rha hoga wo consider kr lo)
            int v1 = bestSum + num;
            int v2 = num;
            bestSum = Math.max(v1,v2);
            ans = Math.max(bestSum,ans);
        }

        return ans;
    }
}