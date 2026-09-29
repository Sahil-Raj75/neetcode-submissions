class Solution {
    public int maxProduct(int[] nums) {
        int prevmax = 1;
        int prevmin = 1;

        int res = nums[0];

        for(int num : nums){
            int a1 = prevmax * num;
            int a2 = prevmin * num;
            int a3 = num;
            
            prevmax = Math.max(a1 ,Math.max(a2,a3));
            prevmin = Math.min(a1,Math.min(a2,a3));

            int ans = Math.max(prevmax,prevmin);
            res = Math.max(ans,res);
        }
        return res;


    }
}