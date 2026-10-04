class Solution {
    static void solve(int[] arr, int target, int idx,  List<List<Integer>> ans, List<Integer> output){
        if(target == 0){
            ans.add(new ArrayList<>(output));
            return;
        }
        if(target <0){
            return;
        }
        if(idx==arr.length){
            return;
        }

        // include
        output.add(arr[idx]);
        solve(arr,target-arr[idx], idx+1, ans, output);

        // exclude
        while(idx < arr.length-1 && arr[idx+1] == arr[idx]){
            idx++;
        }
        
        output.remove(output.size()-1);
        solve(arr,target, idx+1,ans,output);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        int idx = 0;

        solve(candidates,target, idx,ans,output);

        return ans;
    }
}