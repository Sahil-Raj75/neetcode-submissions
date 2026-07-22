class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0 ;
        int j = nums.length -1;
        while(i<=j){

            int mid = i + (j-i)/2 ;

            if(nums[mid]==target){ // this will return mid if the target found;
                return mid ;
            }

             if(target < nums[mid]){   // when target is less than the mid {insert position of 0 -> (position of 0 at the same palce so direct return 0)}
                j = mid-1; 
            }

             if(target > nums[mid]){   // if the target is greater than mid than ans is mid +1 always ;
                i = mid +1;
            }
        }
        return i;
    }
}