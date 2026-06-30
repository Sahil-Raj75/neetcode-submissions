class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window= new HashSet<>();

        int i = 0;
        for(int j=i;j<nums.length;j++){
            if(j-i>k){ 
                window.remove(nums[i]);
                i++;
            }
            if(window.contains(nums[j])) return true ;
            else {
                window.add(nums[j]);
            }
        }
        return false;
    }
}