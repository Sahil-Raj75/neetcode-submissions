class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int first = 0;
        int second = 0;

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (!map.containsKey(diff)) {
                map.put(nums[i], i);
            }
            else{
                first= map.get(diff);
                second = i;
            }
        }

        return new int[]{first,second};
    }
}
