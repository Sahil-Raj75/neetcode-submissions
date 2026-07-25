class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> map = new HashSet<>();

        int i = 0;
        for(int j=i;j<nums.length;j++){
            if(j-i>k){ 
                map.remove(nums[i]);
                i++;
            }
            if(map.contains(nums[j])) return true ;
            else {
                map.add(nums[j]);
            }
        }
        return false;
    }
}