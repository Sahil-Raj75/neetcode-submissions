public class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> uniqueVal = new TreeSet<>();
        for (int num : nums) {
            if (uniqueVal.contains(num)) {
                continue;
            } else {
                uniqueVal.add(num);
            }
        }
        int i = 0;
        for (int num : uniqueVal) {
            nums[i] = num;
            i++;
        }
        return uniqueVal.size();
    }
}