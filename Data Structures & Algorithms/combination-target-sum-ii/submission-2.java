class Solution {
    static void solve(int[] candidates, int target, List<Integer> TempSubarray, int index,
            List<List<Integer>> FinalResultArray) {
        //base-case - sum agar 0 hota hai tho add to result list
        if (target == 0) {
            FinalResultArray.add(new ArrayList<>(TempSubarray));
            return;
        }

        if (index == candidates.length || target < 0) {
            return;
        }
       
        // include 
        TempSubarray.add(candidates[index]);
        solve(candidates, target - candidates[index], TempSubarray, index+1, FinalResultArray);

        // agar ek element ko exclude kr rhe tho sare subarray ke liye exclude hoga duske subarray me use nhi kr sakte.
        
        while(index+1<candidates.length && candidates[index] == candidates[index+1]){
            index++;
        }

        TempSubarray.remove(TempSubarray.size() - 1);
        // exclude
        solve(candidates, target, TempSubarray, index + 1, FinalResultArray);
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> FinalResultArray = new ArrayList<>();
        List<Integer> TempSubarray = new ArrayList<>();
        int index = 0;

        solve(candidates, target, TempSubarray, index, FinalResultArray);
        return FinalResultArray;
    }
}