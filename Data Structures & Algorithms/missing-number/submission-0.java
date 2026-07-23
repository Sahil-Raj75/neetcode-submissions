class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;

        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        for(int i = 0; i<=size; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return 0;
    }
}