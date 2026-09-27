class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int h = nums.length -1;
        int ans  = nums[0];

       

        while(l<=h){
             if(nums[l]<nums[h]){
            ans =  Math.min(ans,nums[l]);
            break;
        }
            int mid = l + (h - l)/2;
            ans  = Math.min(ans,nums[mid]);
            if(nums[l]<=nums[mid]){
                l = mid + 1;
            }
            else{
            h = mid - 1;   
            }
        }

        return ans;
    }
}
