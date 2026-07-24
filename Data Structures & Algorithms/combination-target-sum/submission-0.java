class Solution {
    static void solve(int[] arr, int target, int idx, List<List<Integer>> ans, List<Integer> output){
        // base-case
        if(target == 0){
            ans.add(new ArrayList<>(output));
            return;
        }
        if(idx >= arr.length){
            return;
        }
        if(target <0) return ;

        // include the current candidate
        output.add(arr[idx]);
        solve(arr, target - arr[idx], idx, ans, output);

        // backtracking case remove the added output cuz has to exclude 
        output.remove(output.size()-1);
        // exclude
        solve(arr, target, idx+1, ans, output);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int idx = 0;
        solve(candidates,target,idx, ans , output);
        return ans;
    }
}