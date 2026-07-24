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
        solve(arr, target - arr[idx], idx+1, ans, output);

        // duplicate remove krte jao ek he bar include krna hai
        while(idx+1<arr.length && arr[idx] == arr[idx+1]){
            idx++;
        } 

        // backtracking case remove the added output cuz has to exclude
        output.remove(output.size()-1);
        // exclude
        solve(arr, target, idx+1, ans, output);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int idx = 0;
        solve(candidates,target,idx, ans , output);
        return ans;
    }
}