class Solution {
    public int maxProduct(int[] nums) {
        int maxEnd = 1;
        int minEnd = 1;
        int ans = nums[0];

        for(int num : nums){
           
            int v1 = maxEnd * num;
            int v2 = minEnd * num;
            int v3 = num;

            maxEnd = Math.max(v1,Math.max(v2,v3));
            minEnd = Math.min(v1,Math.min(v2,v3));
            
            ans = Math.max(ans,Math.max(maxEnd,minEnd));
        }
        return ans;
    }
}