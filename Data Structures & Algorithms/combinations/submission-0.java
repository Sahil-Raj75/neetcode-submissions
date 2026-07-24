class Solution {
    static void solve(int[] arr,int idx, List<List<Integer>> ans, List<Integer> output, int k){
        // base-case
        if(output.size() == k){
            ans.add(new ArrayList<>(output));
            return;
        }
        if(idx >= arr.length){
            return;
        }

        // include the current candidate
        output.add(arr[idx]);
        solve(arr, idx+1, ans, output,k);

        output.remove(output.size()-1);
        // exclude
        solve(arr, idx+1, ans, output,k);
    }
    public List<List<Integer>> combine(int n, int k) {
        int[] candidates = new int[n];
        int pos =0;
        for(int i = 1; i<=n; i++){
            candidates[pos++] = i;
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int idx = 0;
        solve(candidates, idx, ans , output ,k);
        return ans;
    }
}