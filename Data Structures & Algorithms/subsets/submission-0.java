class Solution {
    static void solve(int[] nums, int index, List<List<Integer>> list, List<Integer> output){
        if(index >= nums.length){
            list.add(new ArrayList<>(output));
            return;
        }

        // include-exclude pattern
        int currValue = nums[index];

        // include
        output.add(currValue);
        solve(nums, index+1, list, output);
        // backtracking me remove kr rhe honge
        output.remove(output.size()-1);
        
        // exclude
        solve(nums, index+1, list, output);
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> output = new ArrayList<>(); 
        int index = 0;
        solve(nums,index,list,output);
        return list;
    }
}