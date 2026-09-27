class Solution {
    public int findMin(int[] nums) {
        int s = 0, e = nums.length - 1;
        int min = Integer.MAX_VALUE;

        while(s <= e){
            int mid = s + (e - s)/2;

            // which part is sorted
            if(nums[s] <= nums[mid]){// left part is sorted 
                min = Math.min(nums[s],min);
                s = mid + 1;
            }
            else{ // right part is sorted
                min = Math.min(nums[mid],min);
                e = mid - 1;
            }
        }

        return min;
    }
}